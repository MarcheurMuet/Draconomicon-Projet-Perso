package com.draconomicon.api.repository;

import com.draconomicon.api.model.Encyclopedie;
import org.springframework.data.jpa.repository.JpaRepository;

// La couche repository est une couche intermédiaire entre la couche service et la couche d’accès aux données.
// Cette couche permet de gérer les interactions avec les sources de données externes.
// Elle contient les méthodes pour rechercher et persister les objets du domaine.
public interface EncyclopedieRepository extends JpaRepository<Encyclopedie, Long> {
}
