package com.draconomicon.api.controller;

import com.draconomicon.api.model.Encyclopedie;
import com.draconomicon.api.service.EncyclopedieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// La couche controller est la couche de présentation d’une application Java avec Spring.
// Elle est utilisée pour gérer les interactions entre l’utilisateur de l’application et l’application.
// Elle contient les classes qui gèrent les requêtes HTTP et les réponses HTTP.
@RestController
@RequestMapping("/")
@AllArgsConstructor
public class EncyclopedieController {

    private final EncyclopedieService encyclopedieService;

    @PostMapping("admin/encyclopedie")
    public Encyclopedie create(@RequestBody Encyclopedie encyclopedie) {
        return encyclopedieService.creer(encyclopedie);
    }

    @GetMapping({"public/encyclopedie", "user/encyclopedie", "admin/encyclopedie"})
    public List<Encyclopedie> read() {
        return encyclopedieService.lire();
    }

    @PutMapping("admin/encyclopedie/{id}")
    public Encyclopedie update(@PathVariable Long id, @RequestBody Encyclopedie encyclopedie) {
        return encyclopedieService.modifier(id, encyclopedie);
    }

    @DeleteMapping("admin/encyclopedie/{id}")
    public String delete(@PathVariable Long id) {
        return encyclopedieService.supprimer(id);
    }
}

