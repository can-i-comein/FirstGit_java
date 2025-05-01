package com.kh.practice.chap01_ploy.view;

import java.util.Scanner;

import com.kh.practice.chap01_ploy.controller.LibraryController;
import com.kh.practice.chap01_ploy.model.vo.Book;
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
		
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("===== 메뉴 ======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴번호 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1:
				System.out.println(lc.myinfo());
				break;
			case 2:
				selectAll(); break;
			case 3:
				searchBook(); break;
			case 4:
				rentBook(); break;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력하세요");	
			}
		}
	}
	
	public void selectAll() {
		Book[] blist = lc.selectAll();
		for (int i = 0; i < blist.length; i++) {
			System.out.println(i + "번 도서 : " + blist[i]);
		}	
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for (int i = 0; i < searchList.length; i++) {
			
			System.out.println(searchList[i]);	
		}
	}
	
	public void rentBook() {
		Book[] blist = lc.selectAll();
		for (int i = 0; i < blist.length; i++) {
			System.out.println(i + "번 도서 : " + blist[i]);
		}	
		
		System.out.println("대여할 도서 번호 선택 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(bookNum);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니"
								+ " 마이페이지에서 확인하세요 ");
		}	
	}
}
