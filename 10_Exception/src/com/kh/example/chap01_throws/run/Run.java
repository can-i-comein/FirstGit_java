package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.exception.ThrowsController;

public class Run {
	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 실행...");
		ThrowsController tc = new ThrowsController();
		try {
			tc.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
