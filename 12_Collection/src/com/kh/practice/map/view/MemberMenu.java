package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;


public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("====== KH 추첨 프로그램 ======");

		int menuNum = 0;
		while (menuNum != 9) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}
	
	public void memberMenu() {
		
		int menuNum = 0;
		while (menuNum != 3) {
			System.out.println("====== 회원 메뉴 ======");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				mainMenu();
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
	}
	public void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		Member m = new Member(password, name);
		boolean result = mc.joinMembership(id, m);
		
		if(result == true) {
			System.out.println("성공적으로 회원가입을 완료했습니다.");
		} else 
			System.out.println("중복된 아이디입니다. 다시 입력하세요.");
	}
	public void logIn() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		String result = mc.logIn(id, password);
		if(result != null) {
			System.out.println("환영합니다.");
			memberMenu();
		} else
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
	}
	public void changePassword() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String newPd = sc.nextLine();
		
		boolean result = mc.changePassword(id, password, newPd);
		if(result == true) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		} else
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
	}
	public void changeName() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		String result = mc.logIn(id, password);
		if(result == null) {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
		} else {
			System.out.println(result);
			
			System.out.print("변경할 이름 : ");
			String newName = sc.nextLine();
			mc.changeName(id, newName);
			System.out.println("이름 변경에 성공하였습니다.");
		}
		
	}
	public void sameName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		mc.sameName(name);
	}
	
}
