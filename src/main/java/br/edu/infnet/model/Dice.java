package br.edu.infnet.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="dice")
public class Dice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int type;
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idDice")
	private List<Amount> amounts;
	
}
