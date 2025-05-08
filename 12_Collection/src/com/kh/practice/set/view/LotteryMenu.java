package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {

	LotteryController lc = new LotteryController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("====== KH 추첨 프로그램 ======");

		int menuNum = 0;
		while (menuNum != 9) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 확인");
			System.out.println("3. 추첨 대상 삭제");
			System.out.println("4. 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				insertObject();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				deleteObject();
				break;
			case 4:
				winObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}

	}

	public void insertObject() {
		String yesOrNo = "";
		
		while(true) {
			System.out.println("추첨 대상자를 추가합니다.");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호 : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name, phone);
			boolean result = lc.insertObject(l);
			if(result == false) {
				System.out.println("중복된 대상입니다. 다시입력하세요");
				continue;
			}
			do {
				System.out.println("더 추가하시겠습니까? (Y/N)");
				yesOrNo = sc.nextLine();
				if(yesOrNo.equalsIgnoreCase("N")) {
					System.out.println("추가 완료되었습니다.");
					return;
				} else if(!yesOrNo.equalsIgnoreCase("Y") && !yesOrNo.equalsIgnoreCase("N")){
					System.out.println("Y/N중에 다시 입력하세요");
				}
				else 
					break;
			} while(!yesOrNo.equalsIgnoreCase("N"));
		}
	}

	public void selectAll() {
		HashSet<String> set = lc.selectAll();
		if(set.isEmpty()) {
			System.out.println("추첨 대상자가 없습니다.");
		} else {
			// iterator를 쓰는 이유
			// 1. Set은 인덱스가 없기 때문에 반복문 대신 사용 (향상된 for문 가능)
			// 2. 반복도중 안전하게 요소를 제거가능, Set은 foreach로 순회하면서
			// 	  remove()하면 예외발생
			Iterator<String> it = set.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}
	}

	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호 : ");
		String phone = sc.nextLine();
		
		boolean result = lc.deleteObject(new Lottery(name, phone));
		if(result == true) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}

	public void winObject() {
		HashSet<String> set = lc.winObject();
		if(set == null) 
			System.out.println("추첨 대상이 4명 이상이 되어야 합니다.");
		else
			System.out.println(set);
		
	}

	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호 : ");
		String phone = sc.nextLine();
		
		boolean result = lc.searchWinner(new Lottery(name, phone));
		if(result == true) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
	}
}
