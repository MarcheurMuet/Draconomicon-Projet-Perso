package com.draconomicon.api.model;

// import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "equipement_dragon")
@Getter
@Setter
@NoArgsConstructor
public class Equipement_dragon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipementDragon;

	@Column(name="id_equipement")
	@JoinTable(
			name="equipement",
			joinColumns= {@JoinColumn(name="nom_equipement")}
			)
	private int idEquipement;
	
	@Column(name="id_dragon")
	@JoinTable(
			name="dragon",
			joinColumns= {@JoinColumn(name="name")}
			)
	private int idDragon;

}