package com.kh.homework.shape.view.SquareMenu;

import java.util.Scanner;

import com.kh.homework.shape.controller.SquareController;
import com.kh.homework.shape.model.vo.Square;

public class SquareMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController sqr = new SquareController();

	public void inputMenu() {
		int menuNum = 0;
		while (menuNum != 9) {
			System.out.println("=====사각형을 만들어요=====");
			System.out.println("1. 사각형 생성");
			System.out.println("2. 사각형 둘레 구하기");
			System.out.println("3. 사각형 면적 구하기");
			System.out.println("4. 사각형 색칠하기");
			System.out.println("5. 사각형 정보 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 : ");

			menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1:
				createSquare();
				break;
			case 2:
				getPerimeter();
				break;
			case 3:
				getArea();
				break;
			case 4:
				paint();
				break;
			case 5:
				printInformation();
				break;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요");
			}
		}
	}

	public void createSquare() {
		System.out.println("생성할 사각형의 가로, 세로 길이를 정하시오.");
		System.out.println("가로 : ");
		double width = sc.nextDouble();
		System.out.println("세로 : ");
		double height = sc.nextDouble();
		sc.nextLine();

		Square s = sqr.createSquare(height, width);
		
		if (s != null) {
			System.out.println("사각형이 성공적으로 생성되었습니다.");
		} else
			System.out.println("사각형이 생성되지 않았습니다.");
	}

	public void getPerimeter() {
		double result = sqr.calcPerimeter();
		if (result == 0) {
			System.out.println("사각형을 먼저 생성해주세요.");
		} else {
			System.out.println("둘레 : " + result);
		}
	}

	public void getArea() {
		double result = sqr.calcArea();
		if (result == 0) {
			System.out.println("사각형을 먼저 생성해주세요");
		} else {
			System.out.println("넓이 : " + result);
		}
	}

	public void paint() {
		
		System.out.println("지정할 색깔을 입력");
		System.out.println("색깔 : ");
		String color = sc.nextLine();
		boolean result = sqr.paintColor(color);
		if(result) {
			System.out.println("색이 성공적으로 설정되었습니다.");
		} else {
			System.out.println("사각형을 먼저 생성해주세요.");
		}
	}

	public void printInformation() {
		String result = sqr.print();
		if (result != null) {
			System.out.println(result);
		} else {
			System.out.println("사각형을 먼저 생성해주세요.");
		}
	}
}
