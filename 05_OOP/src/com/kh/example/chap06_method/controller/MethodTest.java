package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_comstructor.model.vo.User;

public class MethodTest {
	public void method1() {
		// 반환값x 매개변수x
		// 아무 값도 전달받지 않고 메소드 내용만 수행 후 아무 값도 반환하지 않고 끝남
		System.out.println("매개변수와 반환 값 둘다 없는 메소드.");
	}
	
	public int method2() {
		// 반환값o 매개변수x
		int num = -4;
		return num;
	}
	public void method3(String address, String hobby) {
		System.out.println(address);
		System.out.println(hobby);
	}
	public double method4(int n1, double n2) {
		// 반환값o 매개변수o
		return n1-n2;
	}
	public void method5(double[] dArr) {
		//매개 변수로 주소값 전하기(배열)
		System.out.println("method5 dArr : " + dArr);
	}
	
	public User method6() {
		// 리턴 값으로 주소값 전하기(클래스)
		User u = new User("아이디", "이름");
		System.out.println("method6 u : " + u);
		return u;
	}
	
	
	
}
