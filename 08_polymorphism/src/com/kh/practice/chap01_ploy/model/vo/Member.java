package com.kh.practice.chap01_ploy.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;
	
	public Member() {
		
	}
	
	public Member(String name, int age, char gender){
		
	}
	
	public String toString() {
		return name + age + gender;
	}
}
