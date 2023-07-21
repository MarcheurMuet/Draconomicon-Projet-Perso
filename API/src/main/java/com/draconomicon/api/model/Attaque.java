package com.draconomicon.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "attaque")
@Getter
@Setter
@NoArgsConstructor
public class Attaque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAttaque;

	@Column(name = "puissance")
	private int puissance;

	@Column(name = "name_attaque")
	private String nameAttaque;

	@Column(name = "physique")
	private int physique;

}