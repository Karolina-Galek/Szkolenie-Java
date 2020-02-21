package com.ey.oop;

import static org.testng.Assert.*;

import com.ey.exercise.Client;
import org.testng.annotations.Test;

public class ClientTest {

	@Test
	public void loginWithValidPassword() {
		Client client = new Client("test1@example.com", 25);
		client.logIn("Pa55w0rd");
		assertTrue(client.isLogged());
	}

	@Test
	public void loginWithInValidPassword() {
		Client client = new Client("test1@example.com", 25);
		client.logIn("invalidPassword");
		assertFalse(client.isLogged());

	}

	@Test
	public void testDeleteAccountWhenUserIsLoggedIn() {
		Client client = new Client("test1@example.com", 25);
		client.logIn("Pa55w0rd");
		client.deleteAccount();
		assertTrue(client.isDeleted());
	}

	@Test
	public void testDeleteAccountWhenUserIsNotLoggedIn() {
		Client client = new Client("test1@example.com", 25);
		client.deleteAccount();
		assertFalse(client.isDeleted());
	}

	@Test
	public void testLoginAfterAccountIsDeleted() {
		Client client = new Client("test1@example.com", 25);
		client.logIn("Pa55w0rd");
		client.deleteAccount();
		client.logIn("Pa55w0rd");
		assertFalse(client.isLogged());

	}
}

