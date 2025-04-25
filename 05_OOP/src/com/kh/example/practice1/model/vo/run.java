package com.kh.example.practice1.model.vo;

public class run {
	public static void main(String[] args) {
//		Member m = new Member();
//		m.printName();
//		m.changeName("황인호");
//		m.printName();

//		Product p = new Product();
//		p.information();

//		Circle c = new Circle();
//		c.getAreaOfCircle();
//		c.getSizeOfCircle();
//		c.incrementRadius();

		Book b = new Book();
		b.Book("어린왕자", "출판사", "생텍쥐페리");
		b.inform();
		b.Book("어린왕자", "출판사", "생텍쥐페리", 25000, 5.5);
		b.inform();
	}
}
