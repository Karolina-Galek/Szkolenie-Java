package com.ey.oop;

public class Restaurant {

	private String name;
	private int numberOfTables;

	public Restaurant(String name, int numberOfTables) {
		this.name = name;
		this.numberOfTables = numberOfTables;
	}

	public void rename(String newName) {
		this.name = newName;
	}

	public void menu() {
		String restaurantMenu = " Soup - 11.22\nSteak-25.45\n";
	}

	public int freeTables() {
		return this.numberOfTables;
	}
}



