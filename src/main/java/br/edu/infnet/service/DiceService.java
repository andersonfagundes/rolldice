package br.edu.infnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.repository.DiceRepository;

@Service
public class DiceService {
	@Autowired
	private DiceRepository rollDiceRepository;
}
