package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("====== 메인메뉴 ======");
			System.out.println("1. 새도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			
			switch(menuNum) {
			case 1:
				insertBook(); break;
			case 2:
				selectList(); break;
			case 3:
				searchBook(); break;
			case 4:
				deleteBook(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
		}
	}
	
	public void insertBook() {
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		String newC = "";
		switch(category) {
		case 1:
			newC = "인문";
		case 2:
			newC = "자연과학";
		case 3: 
			newC = "의료";
		case 4:
			newC = "기타";
		}
		
		sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book b = new Book(title, author, newC, price);
		bc.insertBook(b);
		
	}
	
	public void selectList() {
		
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.addAll(bc.selectList());
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book b : bookList) {
				System.out.println(b.toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("키워드를 입력하세요 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = new ArrayList<>();
		searchList.addAll(bc.searchBook(keyword));
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book b : searchList) {
				System.out.println(b.toString());
			}
		}
	}
	//향상된 for문을 쓰면 순회중에 요소 제거가 일어나 ConcurrentModificationException 발생
	//일반 for문을 쓰거나 Iterator 사용
	public void deleteBook() {
		System.out.print("삭제할 도서명 입력 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 입력 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else
			System.out.println("삭제할 도서를 찾지 못했습니다.");
	}
	
}