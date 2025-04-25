package com.kh.example.chap05_comstructor.model.vo;

public class User {
	private String userId;
	private String userName;
	private int age;
	private double point;
	
	// 생성자
	//[접근제한자] 클래스명([매개변수[, 매개변수...]]){}
	
	// 기본생성자
	public User() {
		System.out.println("this : " + this);
	}
	
 	// 매개변수 있는 생성자
	public User(String userId, String userName, int age, double point) {
		this(userId, userName);
		this.age = age;
		this.point = point;
	}
	
	// 아이디,이름만 매개변수로 있는 생성자
	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public void inform() {
		System.out.print(userId + ", ");
		System.out.print(userName + ", ");
		System.out.print(age + ", ");
		System.out.print(point);
	}
	
	
}
