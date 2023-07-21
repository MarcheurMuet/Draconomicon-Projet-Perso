package com.draconomicon.api.service;

import com.draconomicon.api.model.*;
import java.util.List;

public interface Biome_creatureService {
	Biome_creature creer(Biome_creature biome_creature);
	
	List<Biome_creature> lire();
	
	Biome_creature modifier(Long id_biome_creature, Biome_creature biome_creature);
	
	String supprimer(Long id_biome_creature);
}