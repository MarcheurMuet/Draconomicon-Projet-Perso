package com.draconomicon.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.draconomicon.api.model.Equipement_type;
import com.draconomicon.api.repository.Equipement_typeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Equipement_typeServiceImpl implements Equipement_typeService{

	private Equipement_typeRepository equipement_typeRepository;
	
	@Override
	public Equipement_type creer(Equipement_type equipement_type) {
		return equipement_typeRepository.save(equipement_type);
	}

	@Override
	public List<Equipement_type> lire() {
		return equipement_typeRepository.findAll();
	}

	@Override
	public Equipement_type modifier(Long id_equipement_type, Equipement_type equipement_type) {
		return equipement_typeRepository.findById(id_equipement_type)
				.map(p-> {
					p.setTypeEquipement(equipement_type.getTypeEquipement());
					return equipement_typeRepository.save(p); 			
				}).orElseThrow(() -> new RuntimeException("équipement non trouvé"));
	}

	@Override
	public String supprimer(Long id_equipement_type) {
		equipement_typeRepository.deleteById(id_equipement_type);
		return "Type d'équipement supprimé";
	}

}
