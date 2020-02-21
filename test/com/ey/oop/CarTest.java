package com.ey.oop;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {

	@Test
	public void testNewCarShouldHaveInitialValuesSetToZero() {
		Car car = new Car(5, 5);
		assertEquals(car.totalDistance, 0.0);
		assertEquals(car.gasAmount, 0.0);
	}

	@Test
	public void testCarShouldHaveProperMileageAndGasAmount() {
		double expectedMileage = 10.0;
		double expectedMaxGasAmount = 100;
		Car car = new Car(expectedMileage, expectedMaxGasAmount);
		assertEquals(car.mileage, expectedMileage);
		assertEquals(car.maxGasAmount, expectedMaxGasAmount);
	}

	@Test
	public void ShouldFillUpTankWithProperAmountOfGas() {
		double requestedFillUpAmount = 10;
		double expectedGasAmount = 10;
		Car car = new Car(5.0, 50);
		car.fillUpGas(requestedFillUpAmount);
		assertEquals(car.gasAmount, expectedGasAmount);
	}

	@Test(dataProvider = "requiredExpectedGasAmount")
	public void ShouldFillUpTankWithProperAmountOfGasParametrized(double requestedFillUpAmount,
		double expectedGasAmount) {
		Car car = new Car(5.0, 50);
		car.fillUpGas(requestedFillUpAmount);
		assertEquals(car.gasAmount, expectedGasAmount);
	}


	@DataProvider(name = "requiredExpectedGasAmount")
	public Object[][] requiredExpectedGasAmount() {
		return new Object[][]{
			{10.0, 10.0},
			{50.0, 50.0},
			{51.0, 50.0}
		};
	}

	@Test
	public void NewCarShouldHaveRange0() {
		Car car = new Car(5, 10);
		assertEquals(car.rangeInKilometers(), 0);

	}

	@Test
	public void testCarShouldHaveProperRange() {
		Car car = new Car(10, 50);
		car.fillUpGas(10);
		assertEquals(car.rangeInKilometers(), 100);
	}


	@DataProvider(name = "requiredExpectedDistance")
	public Object[][] requiredExpectedDistance() {
		return new Object[][]{
			{300.0, 0.0, 20.0},
			{100.0, 100.0, 10.0},
			{200.0, 200.0, 0.0}
		};
	}
	@Test(dataProvider = "requiredExpectedDistance")
	public void CarShouldDriveExpectedDistanceParametrized(double distanceToDrive,
		double expectedTotalDistance, double expectedGasAmount) {
		Car car = new Car(10, 50);
		car.fillUpGas(20);
		car.drive(distanceToDrive);
		assertEquals(car.gasAmount, expectedGasAmount);
		assertEquals(car.totalDistance, expectedTotalDistance);


	}

	}
