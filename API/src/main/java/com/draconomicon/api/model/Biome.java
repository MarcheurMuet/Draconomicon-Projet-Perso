package com.draconomicon.api.model;

// import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "biome")
@Getter
@Setter
@NoArgsConstructor
public class Biome {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_biome")
	private int idBiome;
	
	@Column(name="name_biome", length = 25)
	private String nameBiome;

	@Column(name="id_weather")
	private int idWeather;

}