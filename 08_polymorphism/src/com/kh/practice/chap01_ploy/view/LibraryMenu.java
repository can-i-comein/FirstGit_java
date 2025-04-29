package com.kh.practice.chap01_ploy.view;

import java.util.Scanner;

import com.kh.practice.chap01_ploy.controller.LibraryController;
import com.kh.practice.chap01_ploy.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		Member m = new Member(name, age, gender);
		lc.insertMember(m);
		
		while(true) {
		System.out.println("===== 메뉴 ======");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료");
		
		System.out.println("메뉴번호 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1: 
			lc.myinfo();
		case 2:
			lc.selectAll();
		case 3:
			lc.searchBook();
		case 4:
			lc.rentBook();
		case 9:
			System.out.println("프로그램 종료");
		default:
			break;
				
		}
		
		}
	}
	public void selectAll() {
		lc.selectAll();
	}
	
	public void searchBook() {
		
	}
	
	public void rentBook() {
		
	}
}
