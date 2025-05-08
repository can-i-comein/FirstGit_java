package com.kh.overall.farm.model.vo;

public class Farm {
	private String kind;
	private int price;
	private int num;

	public Farm() {
	}

	public Farm(String kind, int price, int num) {
		this.kind = kind;
		this.price = price;
		this.num = num;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String toString() {
		return kind + price + num;

	}

}
