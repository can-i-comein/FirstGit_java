package com.kh.example.chap01_encapsulation;


public class Account {
	private String name = "박신우";
	private String phone = "010-1234-1234" ;
	private String pwd = "pwd123";
	private int bankCode = 3030;
	private int balance = 0;
	
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money +"원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void displayBalance() {
		System.out.println("잔액 확인 : " + balance);
	}
}
