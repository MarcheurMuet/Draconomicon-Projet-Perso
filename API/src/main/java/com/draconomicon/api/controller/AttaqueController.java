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

import com.draconomicon.api.model.Attaque;
import com.draconomicon.api.service.AttaqueService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("admin/attaque")
@AllArgsConstructor
public class AttaqueController {
	private AttaqueService attaqueService;
	
	@PostMapping("/")
	public Attaque create(@RequestBody Attaque attaque) {
		return attaqueService.creer(attaque);
	}
	
	@GetMapping("/")
	public List<Attaque> read(){
		return attaqueService.lire();
	}
	
	@PutMapping("/{id_attaque}")
	public Attaque update(@PathVariable Long id_attaque, @RequestBody Attaque attaque){
		return attaqueService.modifier(id_attaque, attaque);	
	}
	
	@DeleteMapping("/{id_attaque}")
	public String delete(@PathVariable Long id_attaque){
		return attaqueService.supprimer(id_attaque);
	}
}
