package br.edu.infnet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.model.Dice;

@Repository
public interface DiceRepository extends CrudRepository<Dice, Long> {

}
