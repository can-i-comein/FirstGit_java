package com.kh.example.practice1.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius = 1;

	public void incrementRadius() {
		radius += 1;
		getAreaOfCircle();
		getSizeOfCircle();
	}

	public void getAreaOfCircle() {
		System.out.println("원넓이 : " + radius * radius * PI);
	}

	public void getSizeOfCircle() {
		System.out.println("원둘레 : " + 2 * PI * radius);
	}

}
