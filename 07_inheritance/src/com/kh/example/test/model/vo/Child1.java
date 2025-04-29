package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	
	
	public Child1() {
		Parent p = new Parent();
//		p.num = 10;
		p.dNum = 10.4;
		p.bool = false;
		p.ch = 'a';
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
