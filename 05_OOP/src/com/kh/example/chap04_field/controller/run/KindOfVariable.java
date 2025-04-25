package com.kh.example.chap04_field.controller.run;

public class KindOfVariable {
	private int globalNum; // 필드 = 멤버변수 = 멤버필드 = 전역변수
	
	
	public void method1(int num) {
		//매개변수도 지역변수에 포함
		System.out.println(globalNum);
		
		int localNum = 0; // 지역변수는 초기화를 해야함
		
		System.out.println(localNum);
		
		System.out.println(num);
	}
	
	public void method2() {
		System.out.println(globalNum);
	}
}
