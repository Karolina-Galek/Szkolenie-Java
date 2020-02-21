package com.ey;

import com.github.javafaker.Faker;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Second {

	public static void main(String[] args) {
		String[] trainingParticipantsNames = new String[10];// [] tablica o znanej konkretnej wartości o znanej liczbie elementów
		String[] emails = {"a@example.com", "b@examlple.com", "c@example.com"};


		trainingParticipantsNames[0] = "Karolina Gałek";
		trainingParticipantsNames[1] = "Marta Rybczyńska";
		String firstElement = trainingParticipantsNames[0];
		String secondElement = trainingParticipantsNames[1];
		System.out.println(firstElement);
		System.out.println(secondElement);
		trainingParticipantsNames[7] = "Patryk Okoń";

		System.out.println(Arrays.toString(trainingParticipantsNames));
		int participantsNumber = trainingParticipantsNames.length;
		System.out.println(participantsNumber);


		String[] myFriends = new String[5];
		myFriends[0] = "Ania";
		myFriends[1] = "Dorota";
		myFriends [2] = "Ewa";
		myFriends [3] = "Elwira";
		myFriends [4] = "Natalia";

		//String fourthElement = myFriends[3]; mozna tak albo krócej jak w wierszu 34
		//System.out.println(fourthElement);
		System.out.println(myFriends[4]);
		//int friendsList = myFriends.length;
		//System.out.println(friendsList);
		System.out.println("Number of my friends: " + myFriends.length);



		ArrayList<String> friendsPhoneNumbers = new ArrayList<>();
		friendsPhoneNumbers.add("+49111222333");
		friendsPhoneNumbers.add("+4822233334444");
		friendsPhoneNumbers.add(1,"+4822233334444");
		friendsPhoneNumbers.addAll(Arrays.asList("+481111", "+482222"));

		System.out.println("Friends phone list size: " + friendsPhoneNumbers.size());
		System.out.println(friendsPhoneNumbers.get(0));
		int lastElementIndex = friendsPhoneNumbers.size() - 1; // drukowanie ostatniego elementu listy
		System.out.println(friendsPhoneNumbers.get(lastElementIndex));


		ArrayList<Integer> givenNumbers = new ArrayList<>();
		givenNumbers.add(1);
		givenNumbers.add(3);
		givenNumbers.add(1, 5);
		givenNumbers.add(7);
		givenNumbers.add(9);
		givenNumbers.set(3, 11); // .set wstawia liczbę na podanym indeksie
		System.out.println(givenNumbers);

		HashMap<String, String> userEmailLoginMap = new HashMap<>();  // stringi to klucz i wartość
		userEmailLoginMap.put("admin@example.com", "123admin987");
		userEmailLoginMap.put("client1@example.com", "johny_bravo2");
		userEmailLoginMap.put("manager6@example.com", "i_am_the_boss");
		System.out.println(userEmailLoginMap.get("client1@example.com"));


		HashMap<String, Integer>userEmailIdMap = new HashMap<>();
		userEmailIdMap.put("a1@example.com", 789);
		userEmailIdMap.put("a2@example.com", 99399);
		userEmailIdMap.put("a3@example.com", 1304040);
		System.out.println(userEmailIdMap);

		HashMap<String, String> userEmailAndPhone= new HashMap<>();
		userEmailAndPhone.put("denise.webb@example.com", "+450-321-1880");
		userEmailAndPhone.put("alfred.lopez@example.com", "(687)-192-9116");
		userEmailAndPhone.put("isabella.fowler@example.com","(208)-302-6547");
		System.out.println(userEmailAndPhone);

		Locale polish = new Locale("pl_PL");
		Faker faker = new Faker(polish);
		String streetName = faker.address().streetName();
		System.out.println(streetName);

		HashMap<String, String> randomEmailPhoneMap = new HashMap<>();
		String randomEmail = faker.internet().emailAddress();
		String randomPhone = faker.phoneNumber().phoneNumber();
		randomEmailPhoneMap.put(randomEmail, randomPhone);
		randomEmailPhoneMap.put(faker.internet().emailAddress(),faker.phoneNumber().phoneNumber());
		System.out.println(randomEmailPhoneMap);









	}

}
