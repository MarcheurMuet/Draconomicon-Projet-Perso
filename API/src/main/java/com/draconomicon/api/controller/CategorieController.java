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

import com.draconomicon.api.model.Categorie;
import com.draconomicon.api.service.CategorieService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/categorie")
@AllArgsConstructor

public class CategorieController {
	private CategorieService categorieService;
	
	@PostMapping()
	public Categorie create(@RequestBody Categorie categorie) {
		return categorieService.creer(categorie);
	}
	
	@GetMapping()
	public List<Categorie> read(){
		return categorieService.lire();
	}
	
	@PutMapping("/{id_categorie}")
	public Categorie update(@PathVariable Long id_categorie, @RequestBody Categorie categorie){
		return categorieService.modifier(id_categorie, categorie);	
	}
	
	@DeleteMapping("/{id_categorie}")
	public String delete(@PathVariable Long id_categorie){
		return categorieService.supprimer(id_categorie);
	}
}