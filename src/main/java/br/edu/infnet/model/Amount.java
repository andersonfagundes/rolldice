package br.edu.infnet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="amount")
public class Amount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int value;
	@ManyToOne
	@JoinColumn(name = "idDice")
	private Dice dice;

}
