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

import com.draconomicon.api.model.Equipement_dragon;
import com.draconomicon.api.service.Equipement_dragonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/equipement_dragon")
@AllArgsConstructor

public class Equipement_dragonController {
	private Equipement_dragonService equipement_dragonService;
	
	@PostMapping("/")
	public Equipement_dragon create(@RequestBody Equipement_dragon equipement_dragon) {
		return equipement_dragonService.creer(equipement_dragon);
	}
	
	@GetMapping("/")
	public List<Equipement_dragon> read(){
		return equipement_dragonService.lire();
	}
	
	@PutMapping("/{id_equipement_dragon}")
	public Equipement_dragon update(@PathVariable Long id_equipement_dragon, @RequestBody Equipement_dragon equipement_dragon){
		return equipement_dragonService.modifier(id_equipement_dragon, equipement_dragon);	
	}
	
	@DeleteMapping("/{id_equipement_dragon}")
	public String delete(@PathVariable Long id_equipement_dragon){
		return equipement_dragonService.supprimer(id_equipement_dragon);
	}
}
