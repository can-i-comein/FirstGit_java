package com.kh.example.chap05_comstructor.model.vo;

public class Run {
	public static void main(String[] args) {
		User u0 = new User();
		u0.inform();
		
		User u1 = new User("아이디", "이름", 20, 0.0);
		u1.inform();

		User u2 = new User("아이디2", "이름2");
		u2.inform();
	}
}
