package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		int menuNum = 0;
		while(menuNum != 9) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1:
				addList(); break;
			case 2:
				addAtZero(); break;
			case 3:
				printAll(); break;
			case 4:
				searchMusic(); break;
			case 5:
				removeMusic(); break;
			case 6:
				setMusic(); break;
			case 9:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");	
			}
		}
		
	}
	
	public void addList() {
		System.out.println("===== 마지막 위치에 곡 추가 =====");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		boolean result = mc.addList(m);
		if(result == true) {
			System.out.println("추가 성공");
		} else
			System.out.println("추가 실패");
	}
	
	public void addAtZero() {
		System.out.println("===== 첫 위치에 곡 추가 =====");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		int result = mc.addAtZero(m);
		if(result == 1) {
			System.out.println("추가 성공");
		} else
			System.out.println("추가 실패");
	}
	
	public void printAll() {
		System.out.println("===== 전체 곡 목록 출력 =====");
		System.out.println(mc.printAll());
		
	}
	public void searchMusic() {
		System.out.println("===== 특정 곡 검색 =====");
		System.out.print("검색할 곡명 : ");
		String title = sc.nextLine();
		Music result = mc.searchMusic(title);
		
		if(result == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else
			System.out.println(result.toString());
		
	}
	
	public void removeMusic() {
		System.out.println("===== 특정 곡 삭제 =====");
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		Music result = mc.removeMusic(title);
		
		if(result == null) {
			System.out.println("찾으시는 곡을 삭제하지 못했습니다.");
		} else
			System.out.println(result.toString() + "을(를) 삭제했습니다.");
	}
	
	public void setMusic() {
		System.out.println("===== 특정 곡 정보 수정 =====");
		System.out.print("수정할 이전 곡 명 : ");
		String title = sc.nextLine();
		
		Music result = mc.searchMusic(title);
		if(result == null) {
			System.out.println("해당 곡은 존재하지 않습니다.");
		} else {
			System.out.println("무엇으로 바꾸시겠어요?");
			System.out.print("수정할 곡 명 : ");
			String newTitle = sc.nextLine();
			System.out.print("수정할 가수 명 : ");
			String newSinger = sc.nextLine();
			Music newMusic = new Music(newTitle, newSinger);
			mc.setMusic(title, newMusic);
			System.out.println(result.toString() + "(이)가 값이 변경되었습니다.");
		}
	}
}
