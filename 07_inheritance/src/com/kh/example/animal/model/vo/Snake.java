package com.kh.example.animal.model.vo;

public class Snake extends Animal{

	String pattern;
	
	public Snake() {
		
	}
	
	public Snake(String name, int age, double weight, String pattern) {
		super(name, age , weight);
		this.pattern = pattern;
	}
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
	
//	@Override
//	public String inform() {
//		return super.inform() + pattern;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + pattern;
	}
}
