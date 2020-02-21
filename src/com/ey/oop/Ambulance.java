package com.ey.oop;

public class Ambulance extends Car {

	protected int numberOfBeds;
	private boolean lightsOn = false;


	public Ambulance(double mileage, double maxGasAmount, int numberOfBeds) {
		super(mileage, maxGasAmount);
		this.numberOfBeds = numberOfBeds;


	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public void turnOnLights() {
		this.lightsOn = true;
		System.out.println("Lights are on");
	}

	public void turnOffLights() {
		this.lightsOn = false;
		System.out.println("Lights are off");
	}

	public boolean isLightsOn() {
		return this.lightsOn;
	}
}



