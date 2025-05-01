package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		int menuNum = 0;
		
		while(menuNum !=3 ) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			
			System.out.print("입력 : ");
			menuNum = sc.nextInt();
			
			sc.nextLine();
			switch(menuNum) {
			case 1:
				tokenMenu(); break;
			case 2:
				inputMenu(); break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.print("토큰 처리 전 글자 : ");
		System.out.println(str);
		System.out.print("토큰 처리 전 개수 : ");
		System.out.println(str.length());
		
		System.out.print("토큰 처리 후 글자 : ");
		System.out.println(tc.afterToken(str));
		System.out.print("토큰 처리 후 개수 : ");
		System.out.println(tc.afterToken(str).length());
		System.out.print("모두 대문자 : ");
		System.out.println(tc.afterToken(str).toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.print("첫글자 대문자 : ");
		System.out.println(tc.firstCap(str));

		System.out.print("찾을 문자를 하나 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		System.out.print(ch + " 문자가 들어간 개수 : ");
		System.out.println(tc.findChar(str, ch));
		
	}
}
