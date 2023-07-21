package com.draconomicon.api.service;

import com.draconomicon.api.model.*;
import java.util.List;

public interface BiomeService {
	Biome creer(Biome biome);
	
	List<Biome> lire();
	
	Biome modifier(Long id_biome, Biome biome);
	
	String supprimer(Long id_biome);
}
