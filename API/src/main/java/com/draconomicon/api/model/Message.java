package com.draconomicon.api.model;


import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "message")
@Getter
@Setter
@NoArgsConstructor
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMessage;

	// @JoinColumn(name= "id_equipement")
	// @MapsId
	@Column(name="titre", length = 20)
	private String titre;

    @Column(name="message", length = 1000)
	private String message;
    
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