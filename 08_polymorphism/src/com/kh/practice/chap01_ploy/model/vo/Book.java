package com.kh.practice.chap01_ploy.model.vo;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book() {
		
	}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String toString() {
		return title + author + publisher;
	}
}
