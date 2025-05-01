package com.kh.example.chap02_Wrapper.controller;

public class WrapperController {
	public void method() {
		int n1 = 10;	// 기본자료형
		Integer integer1 = new Integer(n1); // 기본자료형 -> wrapper : boxing
		// boxing : 기본 자료형을 객체로 변환하는 것
		int num2 = integer1.intValue(); // wrapper class -> 기본자료형 : unboxing
		// unboxing : 객체를 기본자료형으로 변환하는 것
		
		// jdk 1.5 autoboxing, autounboxing
		Integer integer2 = num2; // autoboxing
		int num3 = integer2; ///autounboxing
		
	}
}
