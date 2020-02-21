package com.ey;

import com.github.javafaker.Faker;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.omg.CORBA.WStringSeqHelper;
import org.w3c.dom.ls.LSOutput;

public class Loops {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Obecna wartość wskaźnika i: "
				+ i);// dla i zaczynajacego się od 0 dla i mniejszych o 10 co 1 (i++ zwiększaj o 1
		}
		List<Integer> squaresOfNumbers = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			int square = (int) Math.pow(i, 2);
			squaresOfNumbers.add(square);
		}
		System.out.println(squaresOfNumbers);

		Faker fake = new Faker();
		String[] randomEmails = new String[30];
		for (int i = 0; i < randomEmails.length; i++) {
			String randomEmail = fake.internet().emailAddress();
			randomEmails[i] = randomEmail;
		}
		System.out.println(Arrays.toString((randomEmails)));

		for (String email : randomEmails) { //pętla for each działa dla każdego elementu
			System.out.println(email.toUpperCase());
		}
		List<Integer> randomAges = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			int randomAge = new Random().nextInt(100) + 1;
			randomAges.add(randomAge);
		}
		System.out.println(randomAges);

		List<Boolean> agesToAdults = new ArrayList<>();
		for (Integer age : randomAges) {
			boolean isAdult = false;
			if (age >= 18) {
				isAdult=true;
			}
			System.out.printf("User age: %s, is adult: %s\n", age,isAdult);
			agesToAdults.add(isAdult);
			}

		Integer[] userIds = {111, 324, 765,789,44, 230,101};
		for (Integer id : userIds){
			if(id % 2 == 0 ) { // liczby parzyste podzielne przez 2 % modulo dzielenie z resztą 0
				System.out.println("Is even");
			} else {
				System.out.println("Is odd");
			}

			int k = 0;
			while(k<10){
				System.out.println("wartość wskażnika: "+ k);
				k +=3; // przeskakuje o 3 , ++ zwiększa o 1
			}

			int u = 1;
			while (u<=21){
				System.out.println("Potęga trzecia liczby: " + (int)Math.pow(u,3));
				u+=4;



			}


		}


	}
	}








