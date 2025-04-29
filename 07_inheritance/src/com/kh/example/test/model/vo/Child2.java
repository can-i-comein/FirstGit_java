package com.kh.example.test.model.vo;

public class Child2 extends Parent {
	private String str;
	
	public Child2() {
		//super.num =1;
		super.dNum = 12.3;
		super.bool = true;
		super.ch = 'c';
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
