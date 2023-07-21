package com.draconomicon.api.model;


import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
// import org.springframework.cloud.task.timestamp;

// import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "categorie")
@Setter
@NoArgsConstructor
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMessage;

	// @JoinColumn(name= "id_equipement")
	// @MapsId
	@Column(name="titre", length = 20)
	private String titre;

    @Column(name="categorie", length = 1000)
	private String categorie;
    
    @Column(name="date_post")
    @CreationTimestamp
	// @Temporal(TemporalType.TIMESTAMP)
	private Timestamp datePost;
	// import java.time.ZonedDateTime;
	// private ZonedDateTime timestamp;

    @Column(name="id_topic")
	private int idTopic;
	
    @Column(name="id_profil")
	private int idProfil;
}