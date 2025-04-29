package com.kh.example.test.model.vo;

public class Child1 extends Parent {
	private int z;

	public Child1() {
		
	}
	public Child1(int x, int y, int z) {
		super(x,y);
		this.z =z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ() {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("나 니 1번 자식");
	}
}
