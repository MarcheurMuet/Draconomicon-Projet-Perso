package com.draconomicon.api.service;

import com.draconomicon.api.model.Encyclopedie;

import java.util.List;

public interface EncyclopedieService {
    Encyclopedie creer(Encyclopedie encyclopedie);

    List<Encyclopedie> lire();

    Encyclopedie modifier(Long id, Encyclopedie encyclopedie);

    String supprimer(Long id);
}
