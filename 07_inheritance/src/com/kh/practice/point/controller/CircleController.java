package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double area = 3.14 * radius * radius;
		String areaStr = Double.toString(area);

		return c.toString() + " / " + areaStr;
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double cir = 2 * 3.14 * radius;
		String cirStr = Double.toString(cir);
		
		return c.toString() + " / " + cirStr;
	}
}
