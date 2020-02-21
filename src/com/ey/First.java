package com.ey;

public class First {

	public static void main(String[] args) {

		String myFavouriteMovie = "Joker"; // deklarujesz wartość zmiennej mój ulubiony film
		System.out.println("Mój ulubiony film to "  + myFavouriteMovie); // drukujesz swój ulubiony film
		System.out.printf("Mój ulubiony film to %s\n", myFavouriteMovie); // %s dodaje string a po przecinku deklarujemy zmienną
		System.out.printf("Mój ulubiony film to %s\n", myFavouriteMovie); // \n przeskakuje do nowej linii printf formatuje zmienną

		int age = 40;
		String phone = "+48999990";
		System.out.printf("Mój wiek to %s.\n Mój numer telefonu to %s.", age, phone);
		String description = String.format("Mój wiek to %s.\nMój numer telefonu to %s", age, phone);

		double temperaturaDzisiaj = 14.5;
		System.out.println(temperaturaDzisiaj);
		double temperaturaDzisiajWfarenhaitach = temperaturaDzisiaj * (9/5) + 32;
		System.out.println(temperaturaDzisiajWfarenhaitach);

		double pi = 3.1415;
		int promien = 3;
		double circleArea = pi * Math.pow(pi,2);  //podnoszenie do potegi metodą Math.pow
		double circleCircumference = 2 * pi * promien;
		System.out.println(circleArea);
		System.out.printf("Pole koła : %s\n", circleCircumference);
		System.out.printf("Obwód koła: %s\n", circleArea);

		int start =30;
		int end = 40;
		boolean startBeforeEnd = start > end;
		System.out.println("Start before end: " + startBeforeEnd);

		int wiek = 40;
		int wzrost = 168;
		String email = "karolina.galek@gds.ey.com";
		System.out.printf("Mój email to: %s.\nMam lat: %s.\nMój wzrost wynosi %s" + " metra.",
			email, wiek, wzrost);



	}

}



