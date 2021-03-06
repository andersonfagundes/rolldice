package br.edu.infnet.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> getResultRollDices(@RequestParam(name = "type") Integer face,
																	@RequestParam(name = "amount") Integer amount) {
		Integer result = diceService.rollDices(face, amount);
		
		//Thread.sleep(7000);
		
		Map<String, Object> payload = new HashMap<>();
		payload.put("value", result);
		
		return ResponseEntity.ok(payload);
	}
}
