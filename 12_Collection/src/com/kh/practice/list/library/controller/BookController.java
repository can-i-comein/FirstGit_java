package com.kh.practice.list.library.controller;

import java.util.ArrayList;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private ArrayList<Book> bookList = new ArrayList<>();
	
	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return bookList;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		
		for (Book b : bookList) {
			if(bookList.contains(keyword)) {
				searchList.add(b);
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String keyword, String author) {
		Book removeBook = null;
		for (int i = 0; i < array.length; i++) {
			if(bookList.contains(keyword) && bookList.contains(author)) {
				bookList.remove(i);
			}
		}
		return removeBook;
	}
}