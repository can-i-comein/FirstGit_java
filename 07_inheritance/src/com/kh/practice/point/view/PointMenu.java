package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();

	public void mainMenu() {
		int menu = 0;
		while (menu != 9) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				circleMenu();
			} else if (menu == 2) {
				rectangleMenu();
			} else if (menu == 9) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("다시 입력하시오");
				continue;
			}

		}
	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");

		int menu = sc.nextInt();
		sc.nextLine();
		if (menu == 1) {
			calcCircum();
		} else if (menu == 2) {
			calcCircleArea();
		} else
			mainMenu();
	}

	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");

		int menu = sc.nextInt();
		sc.nextLine();
		if (menu == 1) {
			calcPerimeter();
		} else if (menu == 2) {
			calcRectArea();
		} else
			mainMenu();
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		sc.nextLine();

		System.out.print("원둘레 : ");
		System.out.println(cc.calcCircum(x, y, r));
		
	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		sc.nextLine();

		System.out.println("면적 : ");
		System.out.println(cc.calcArea(x, y, r));
		
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		sc.nextLine();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		sc.nextLine();

		System.out.println("사각형 둘레 : ");
		System.out.println(rc.calcPerimeter(x, y, h, w));
	
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		sc.nextLine();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		sc.nextLine();

		System.out.println("사각형 면적 : ");
		System.out.println(rc.calcArea(x, y, h, w));
	}

}
