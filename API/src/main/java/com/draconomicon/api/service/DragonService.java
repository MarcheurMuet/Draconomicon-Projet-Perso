package com.draconomicon.api.service;

import com.draconomicon.api.model.Dragon;

import java.util.List;
import java.util.Optional;

public interface DragonService {
    Dragon creer(Dragon dragon);

    List<Dragon> lire();

    Optional<Dragon> donne(Long id);

    Dragon modifier(Long id, Dragon dragon);

    String supprimer(Long id);
}
