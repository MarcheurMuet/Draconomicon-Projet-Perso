package com.draconomicon.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.draconomicon.api.model.Attaque;
import com.draconomicon.api.repository.AttaqueRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AttaqueServiceImpl implements AttaqueService{

	private AttaqueRepository attaqueRepository;
	
	@Override
	public Attaque creer(Attaque attaque) {
		return attaqueRepository.save(attaque);
	}

	@Override
	public List<Attaque> lire() {
		return attaqueRepository.findAll();
	}

	@Override
	public Attaque modifier(Long id_attaque, Attaque attaque) {
		return attaqueRepository.findById(id_attaque)
				.map(p-> {
					p.setIdAttaque(attaque.getIdAttaque());
					p.setPuissance(attaque.getPuissance());
					p.setNameAttaque(attaque.getNameAttaque());
					p.setPhysique(attaque.getPhysique());
					return attaqueRepository.save(p); 			
				}).orElseThrow(() -> new RuntimeException("Attaque non trouvé"));
	}

	@Override
	public String supprimer(Long id_attaque) {
		attaqueRepository.deleteById(id_attaque);
		return "Attaque supprimé";
	}

}
