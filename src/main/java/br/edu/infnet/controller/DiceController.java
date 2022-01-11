package br.edu.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.service.DiceService;

@RestController
@RequestMapping("/api/rolldices")
public class DiceController {
	@Autowired
	DiceService diceService;

	@GetMapping("/start")
	ResponseEntity<String> rollDices(@RequestParam(name = "type") Integer face,
								 @RequestParam(name = "amount") Integer amount) {

		Integer result = diceService.rollDices(face, amount);

		return new ResponseEntity<>("{value:"+result+"}", HttpStatus.OK);
	}
}
