package com.draconomicon.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.draconomicon.api.model.Biome_creature;
import com.draconomicon.api.repository.Biome_creatureRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Biome_creatureServiceImpl implements Biome_creatureService{

	private Biome_creatureRepository biome_creatureRepository;
	
	@Override
	public Biome_creature creer(Biome_creature biome_creature) {
		return biome_creatureRepository.save(biome_creature);
	}

	@Override
	public List<Biome_creature> lire() {
		return biome_creatureRepository.findAll();
	}

	@Override
	public Biome_creature modifier(Long id_biome_creature, Biome_creature biome_creature) {
		return biome_creatureRepository.findById(id_biome_creature)
				.map(p-> {
					p.setNameBiome_Creature(biome_creature.getNameBiome_Creature());
					p.setNameBiome(biome_creature.getNameBiome());
					p.setNameCreature(biome_creature.getNameCreature());
					return biome_creatureRepository.save(p); 			
				}).orElseThrow(() -> new RuntimeException("Créature non trouvé"));
	}

	@Override
	public String supprimer(Long id_biome_creature) {
		biome_creatureRepository.deleteById(id_biome_creature);
		return "Créature supprimé";
	}

}
