package com.ey;

import com.sun.deploy.security.SelectableSecurityManager;
import java.util.Random;

public class ControlStructures {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		if (a > b) { // mozna uzyc ternary operators ? :
			System.out.println("Math is wrong");
		} else {
			System.out.println("Math is correct");
		}
		System.out.println("I'm always here!");

		double temperature = 0.3;  // jeśli temperatura >20 to wydrukuj w przypadku kiedy, w przypadku gdy tem = 10 wydrukuj
		if (temperature > 20) {
			System.out.println("It's warm");
		} else if (temperature > 10) {
			System.out.println("It is chill");
		} else {
			System.out.println("It is cold");
		}

		Random random = new Random(); //generowanie randowmowych wartosci

		int score = random.nextInt(400)+1; // minimalna wylosowana jest 0 max 400 jesli bound jest 400 jak dodam +1 od 1 losuje
		System.out.println("Generated score : " + score);
		if (score >= 200) {
			System.out.println("You win!");
		} else if (score>100) { // wypada z petli i nie wejdzie do keep trying
			System.out.println("Keep trying");
		} else {
				System.out.println("Looser");
			}

		String manufacturer = "Maluch";
		switch (manufacturer){
			case "Toyota":
				System.out.println("Japan");
				break;
			case"BMW":
				System.out.println("Germany");
				break;
			case"Kia":
				System.out.println("Korea");
				break;
			default:
				System.out.println("unknown");
				break;
		}
			}
		}




