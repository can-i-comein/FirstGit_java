package com.kh.example.animal.model.vo;

public class Animal {
	
	private String name;
	private int age;
	private double weight;
	
	public Animal() {
		
	}
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
//	public String inform() {
//		return name + age + weight;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + age + weight;
	}
}
