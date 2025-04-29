package com.kh.practice.chap01_ploy.model.vo;

public class AniBook extends Book {
	private int accessAge;
	
	public AniBook() {
		
	}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	@Override
	public String toString() {
		return super.toString() + Integer.toString(accessAge);
	}
}

