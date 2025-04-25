package com.kh.example.chap01_encapsulation;

public class Run {
		public static void main(String[] args) {
			Account a = new Account();
			 a.displayBalance();
			 a.deposit(1000000);
			 a.displayBalance();
			 
			 a.deposit(1500000);
			 a.displayBalance();

			 a.withdraw(300000);
			 a.displayBalance();
			 
			 a.withdraw(3000);
			 a.displayBalance();

		}

}
