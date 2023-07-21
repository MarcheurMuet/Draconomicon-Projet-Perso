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

import com.draconomicon.api.model.Equipement_type;
import com.draconomicon.api.service.Equipement_typeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/equipement_type")
@AllArgsConstructor

public class Equipement_typeController {
	private Equipement_typeService equipement_typeService;
	
	@PostMapping("/")
	public Equipement_type create(@RequestBody Equipement_type equipement_type) {
		return equipement_typeService.creer(equipement_type);
	}
	
	@GetMapping("/")
	public List<Equipement_type> read(){
		return equipement_typeService.lire();
	}
	
	@PutMapping("/{id_equipement_type}")
	public Equipement_type update(@PathVariable Long id_equipement_type, @RequestBody Equipement_type equipement_type){
		return equipement_typeService.modifier(id_equipement_type, equipement_type);	
	}
	
	@DeleteMapping("/{id_equipement_type}")
	public String delete(@PathVariable Long id_equipement_type){
		return equipement_typeService.supprimer(id_equipement_type);
	}
}
