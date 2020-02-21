package com.ey.oop;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class AmbulanceTest {

	@Test // adnotacja zwana dekoratorem, zawsze jest bezpośrednio nad metodą - test to jest metoda testowa
	public void testInitialNumberOfBeds() {
		int expectedNumberOfBeds = 5;
		Ambulance ambulance = new Ambulance(10,5, expectedNumberOfBeds);
		assertEquals(ambulance.numberOfBeds, expectedNumberOfBeds);
	}

	@Test
	public void testTurnOnLights() {
		int expectedNumberOfBeds = 5;
		Ambulance ambulance = new Ambulance(10,5,expectedNumberOfBeds);
		ambulance.turnOnLights();
		assertTrue(ambulance.isLightsOn());

	}
	@Test
	public void testTurnOffLights() {
		int expectedNumberOfBeds = 5;
		Ambulance ambulance = new Ambulance(10, 5, expectedNumberOfBeds);
		ambulance.turnOnLights();
		ambulance.turnOffLights();
		assertFalse(ambulance.isLightsOn());
	}
		@Test
		public void testNewAmbulanceLightsAreOff() {
			Ambulance ambulance = new Ambulance(10, 5, 1);
			assertFalse(ambulance.isLightsOn());
		}


	}
