package com.kh.overall.farm.model.vo;

public class Purchase {
	
	private String buyer;
	private String date;
	private String product;
	private int price;
	private int num;
	private int total;
	
	public Purchase() {}
	public Purchase(String buyer, String date, String product, int price, int num, int total) {
		this.buyer = buyer;
		this.date = date;
		this.product = product;
		this.price = price;
		this.num = num;
		this.total = total;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public String toString() {
		return buyer + date + product + price + num + total;
	}
	
	
}
