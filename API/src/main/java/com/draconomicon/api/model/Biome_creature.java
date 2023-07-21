package com.draconomicon.api.model;

// import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "biome_creature")
@Getter
@Setter
@NoArgsConstructor
public class Biome_creature {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEspece;

	// @JoinColumn(name= "id_equipement")
	// @MapsId
	@Column(name="id_biome_creature", length = 25)
	private String nameBiome_Creature;

	@Column(name="id_creature", length = 25)
	private String nameCreature;

	@Column(name="id_biome", length = 25)
	private String nameBiome;
}