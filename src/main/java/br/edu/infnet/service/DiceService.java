package br.edu.infnet.service;

import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class DiceService {

	public Integer rollDices(Integer face, Integer amount) {
		int i = 1;
		int result = 0;
		int randomicNumber = 0;
		
		Random random = new Random();

		while(i <= amount) {
			randomicNumber = random.nextInt(face + 1);
			if(randomicNumber == 0) {
				continue;
			}
			result += randomicNumber;
			i++;
		}
		
		return result;
	}
	
}
