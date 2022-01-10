package br.edu.infnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.Dice;

@Repository
public interface DiceRepository extends JpaRepository<Dice, Long> {

}
