package com.ey.oop;

public class Car extends Vehicle {

	protected double totalDistance = 0.0;
	protected double gasAmount = 0.0; // ilość paliwa
	public double maxGasAmount; // max ilość paliwa
	public double mileage;

	public Car(double mileage, double maxGasAmount) {
		super(4); // wywołanie konstruktora z klasy nadrzędnej Vehicle
		this.mileage = mileage;
		this.maxGasAmount = maxGasAmount;
	}

	public void fillUpGas(
		double requestedGasAmount) { //poproszona ilosć paliwa nie więcej niż możemy wlać
		double availableTankVolume = this.maxGasAmount - this.gasAmount;
		if (requestedGasAmount > availableTankVolume) {
			this.gasAmount = maxGasAmount;
		} else {
			this.gasAmount += requestedGasAmount;
		}
	}

	public void drive(double distanceInKilometers) {
		if (distanceInKilometers > this.rangeInKilometers()) {
			System.out.println("Not enough gas in tank\n");
		} else {
			System.out.printf("Driving %s kilometers \n", distanceInKilometers);
			this.totalDistance += distanceInKilometers;
			this.gasAmount -= mileage * distanceInKilometers / 100;

		}
	}

	// dystans który mogę policzyć
	public double rangeInKilometers() {
		return this.gasAmount / this.mileage * 100;
	}


	public void describe() {
		System.out.printf("Current amount of gas in tank: %s\t|\t", this.gasAmount);
		System.out.printf("Current range is  %s\t|\t", this.rangeInKilometers());
		System.out.printf("Current total distance is %s\n", this.totalDistance);
		System.out.printf("Number of wheels %s\t|\t", this.numberOfWheels);
	}


}
