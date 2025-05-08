package com.kh.overall.farm.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.overall.farm.model.DAO.FarmDAO;
import com.kh.overall.farm.model.vo.Farm;
import com.kh.overall.farm.model.vo.Purchase;

public class FarmController {
	FarmDAO fd = new FarmDAO();
	HashMap<String, Farm> farm = new HashMap<>();

	public FarmController() {

	}

	public HashMap<String, Farm> printFarm() {

	}

	public Farm addNewKind(String name, Farm f) {

	}

	public void insertNewKind() {

	}

	public boolean checkFarm(String name) {

	}

	public void changeName(int menuNum, String name, int newNum) {

	}

	public void changeNumber(int menuNum, String name, int newNum) {

	}

	public void removeFarm(String name) {

	}

	public void buyFarm(String name, int price, int num, int total) {

	}

	public ArrayList<Purchase> printBuyFarm() {

	}

	public void refund(ArrayList<Purchase> list) {

	}

	public ArrayList<Purchase> selectAllBuying() {

	}
}
