package com.ey.oop;

public class Circle {

	private double r;
	public double pi = 3.1415;

	public Circle(double r) {
		this.r = r;
	}


	public void setRadius(double circleRadius) {
		this.r = circleRadius;
	}

	public Double circumference() {
		return 2 * pi * r;


	}

	public Double area() {
		return pi * Math.pow(r, 2);
	}
}
