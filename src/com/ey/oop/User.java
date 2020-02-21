package com.ey.oop;

public class User {

	private String firstName;  // public to deskryptor
	public int age;
	private String email = "invalid@exaple.com";

	public User(String firstName) {
		this.firstName = firstName;

	}


	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;

	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public String getEmail() {
		return this.email;
	}

	public void sayHello() {
		String description = String.format("Hello my name is %s\n", this.firstName);
		if (this.age > 0) {
			description = description.concat("My age is " + this.age);
		}
		if (!this.email.equals("invalid@example.com")) {
			description = description.concat(" My email is " + this.email);
		}
		System.out.println(description);

	}


	public String getFirstName() {
		return this.firstName;
	}

}



