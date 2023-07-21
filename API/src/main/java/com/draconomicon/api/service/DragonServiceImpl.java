package com.draconomicon.api.service;

import com.draconomicon.api.model.Dragon;
import com.draconomicon.api.repository.DragonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DragonServiceImpl implements DragonService {

    private final DragonRepository dragonRepository;

    @Override
    public Dragon creer(Dragon dragon) {
        return dragonRepository.save(dragon);
    }

    @Override
    public List<Dragon> lire() {
        return dragonRepository.findAll();
    }

    @Override
    public Optional<Dragon> donne(Long id) {
        return dragonRepository.findById(id);
    }

    @Override
    public Dragon modifier(Long id, Dragon dragon) {
        return dragonRepository.findById(id).map(d -> {
            d.setName(dragon.getName());
            d.setGenre_dragon(dragon.getGenre_dragon());
            d.setLvl_dragon(dragon.getLvl_dragon());

            return dragonRepository.save(d);
        }).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        dragonRepository.deleteById(id);
        return "Dragon supprimé";
    }
}
