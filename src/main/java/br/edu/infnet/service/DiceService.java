package br.edu.infnet.service;

import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class DiceService {

	public Integer rollDices(Integer face, Integer amount) {
		int i = 1;
		int result = 0;
		
		while(i <= amount) {
			Random random = new Random();
			if(random.nextInt(face) == 0) continue;
			result += random.nextInt(face+1);
			i++;
		}
		
		return result;
	}
	
}
