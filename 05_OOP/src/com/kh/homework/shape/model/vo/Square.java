package com.kh.homework.shape.model.vo;

public class Square {
	private double height;
	private double width;
	private String color = "white";

	public Square() {

	}

	public Square(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String inform() {
		return "height : " + height + ", width : " + width + ", color : " + color;
	}
}
