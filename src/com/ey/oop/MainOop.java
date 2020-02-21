package com.ey.oop;

public class MainOop {

	public static void main(String[] args) {
//		User adrian = new User("Adrian");
//		adrian.age = 31;
//		User kasia = new User("Kasia");
//		adrian.sayHello();
//		kasia.sayHello();
//
//		kasia.setFirstName("Monika");
//		kasia.setEmail("newMonika@example.com");
//		kasia.sayHello();
//
//
//		Circle kolo1 = new Circle(2);
//		kolo1.area();
//		System.out.println("Pole koła to: " + kolo1.area());
//		System.out.println("Obwód koła to: " + kolo1.circumference());
//		kolo1.setRadius(5);
//		System.out.println("Nowe pole koła to: " + kolo1.area());
//
//		Restaurant bohemia = new Restaurant("Bohemia", 100);


//		Car car = new Car(8.5,45.0);
//		car.describe();
//		car.fillUpGas(10);
//		car.describe();
//		car.fillUpGas(100);
//		car.describe();
//
//		car.drive(100);
//		car.drive(200);
//		car.drive(300);
//		car.describe();
//		car.fillUpGas(5);
//		car.describe();
		Vehicle vehicle = new Vehicle(10);
		vehicle.describe();
		Car car = new Car(8,50);
		car.describe();
		Ambulance ambulance = new Ambulance(10,100,2);
		ambulance.turnOnLights();
		ambulance.fillUpGas(15);
		ambulance.describe(); // metoda która drukuje
		ambulance.drive(100);
		ambulance.describe();
		ambulance.turnOffLights();
		ambulance.describe();

	}

}
