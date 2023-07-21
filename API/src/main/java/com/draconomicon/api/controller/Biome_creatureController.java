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

import com.draconomicon.api.model.Biome_creature;
import com.draconomicon.api.service.Biome_creatureService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/biome_creature")
@AllArgsConstructor

public class Biome_creatureController {
	private Biome_creatureService biome_creatureService;
	
	@PostMapping("/")
	public Biome_creature create(@RequestBody Biome_creature biome_creature) {
		return biome_creatureService.creer(biome_creature);
	}
	
	@GetMapping("/")
	public List<Biome_creature> read(){
		return biome_creatureService.lire();
	}
	
	@PutMapping("/{id_biome_creature}")
	public Biome_creature update(@PathVariable Long id_biome_creature, @RequestBody Biome_creature biome_creature){
		return biome_creatureService.modifier(id_biome_creature, biome_creature);	
	}
	
	@DeleteMapping("/{id_biome_creature}")
	public String delete(@PathVariable Long id_biome_creature){
		return biome_creatureService.supprimer(id_biome_creature);
	}
}