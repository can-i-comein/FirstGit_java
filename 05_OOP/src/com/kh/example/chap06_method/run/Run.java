package com.kh.example.chap06_method.run;

import java.util.Scanner;

import com.kh.example.chap06_method.controller.MethodTest;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
//		mt.method1();
//		System.out.println(mt.method2());
//		mt.method3("독서", "서울 중구");
//
//		double[] d = new double[3];
//		System.out.println("main d : " + d);
//		mt.method5(d);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("반 : ");
		char classRoom = sc.nextLine().charAt(0);
		System.out.println("시간 : ");
		String time = sc.nextLine();
		System.out.println("정수 : ");
		double score = sc.nextDouble();
				
		Trainee t = new Trainee(name,classRoom, time, score);
		System.out.println(t.inform());
		
		System.out.println("다시 점수를 입력 : ");
		double newScore = sc.nextInt();
		
		t.setscore(newScore);
//		Trainee.setscore(newScore);
		
	}
}
