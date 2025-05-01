package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		try {
			int a = 10 / 0;
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("method1() 종료됨...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
		throw new IOException();
		//System.out.println("method2() 종료됨...");
	}
}
