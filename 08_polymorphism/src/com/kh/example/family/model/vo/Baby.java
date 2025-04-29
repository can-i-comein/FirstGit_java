package com.kh.example.family.model.vo;

public class Baby extends Family implements Basic {

	public Baby() {
		// TODO Auto-generated constructor stub
	}
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void eat() {
		
	}
	
	@Override
	public void sleep() {
		
	}
	
	@Override
	public void breathe() {
		
	}
	
	

}
