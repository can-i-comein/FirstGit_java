package com.kh.homework.shape.controller;

import com.kh.homework.shape.model.vo.Square;

public class SquareController {
	private Square s;

	public Square createSquare(double height, double width) {
		s = new Square(height, width);
		return s;
	}

	public double calcPerimeter() {
		double result = 0;
		if (s != null) {
			double height = s.getHeight();
			double width = s.getWidth();

			if (height != 0 && width != 0) {
				result = 2 * (height + width);
			}
		}
		return result;
	}

	public double calcArea() {
		double result = 0;
		if (s != null) {
			double height = s.getHeight();
			double width = s.getWidth();

			if (height != 0 && width != 0) {
				result = height * width;
			}
		}
		return result;
	}

	public boolean paintColor(String color) {
	
		if(s != null && s.getWidth() != 0 && s.getHeight() != 0) {
			s.setColor(color);
			return true;
		}
		
		return false;
	}

	public String print() {
		if(s != null && s.getWidth() != 0 && s.getHeight() != 0) {
			return s.inform();
		}
		return null;
	}
}
