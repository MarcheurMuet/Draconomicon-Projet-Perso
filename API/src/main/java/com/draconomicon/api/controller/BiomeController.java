package com.draconomicon.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.draconomicon.api.model.Biome;
import com.draconomicon.api.service.BiomeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/biome")
@AllArgsConstructor

public class BiomeController {
	private BiomeService biomeService;
	
	@PostMapping("/")
	public Biome create(@RequestBody Biome biome) {
		return biomeService.creer(biome);
	}
	
	@GetMapping("/")
	public List<Biome> read(){
		return biomeService.lire();
	}
	
	@PutMapping("/{id_biome}")
	public Biome update(@PathVariable Long id_biome, @RequestBody Biome biome){
		return biomeService.modifier(id_biome, biome);	
	}
	
	@DeleteMapping("/{id_biome}")
	public String delete(@PathVariable Long id_biome){
		return biomeService.supprimer(id_biome);
	}
}
