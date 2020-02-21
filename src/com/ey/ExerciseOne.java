package com.ey;

import com.github.javafaker.Faker;
import java.util.Locale;

public class ExerciseOne {

	public static void main(String[] args) {
		Locale polish = new Locale("pl_PL");// inicjacja fakera żeby można było stworzyć dane randomowe
		Faker fake = new Faker(polish);
		// Faker fake =( new Faker(new Locale("pl"))
		String randomFirstName = fake.name().firstName().toLowerCase();
		System.out.println("Wylosowane imie to: " + randomFirstName);
		if (randomFirstName.contains("m")) {
			System.out.println("M jak miłość");
		} else if (randomFirstName.contains("k")) {
			System.out.println("K jak krowa");
		} else {
			System.out.println("Wszystkie inne literki");
		}
	}


}



