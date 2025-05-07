package com.kh.example.set.model.vo;

import java.util.Objects;

public class Dog {

	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + " / " + weight +  "kg";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		return Objects.equals(name, ((Dog)obj).name) && weight == ((Dog)obj).weight;
	}
	
//	@Override
//	public int hashCode() {
//		return Object.hash(name, weight);
//	}
}
