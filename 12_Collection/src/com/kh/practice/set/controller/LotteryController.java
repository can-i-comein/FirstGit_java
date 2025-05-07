package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	
	HashSet<Lottery> lottery = new HashSet<>();
	HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		boolean result = lottery.add(l);
		return result;
	}
	
	public HashSet selectAll() {
		return lottery;
	}
	
	public boolean deleteObject(Lottery l) {
		
		return ;
	}
	public Hashset winObject(Lottery l) {
		
		return ;
	}
	
	public TreeSet sortedWinObject() {
		
		return ;
	}
	
	public boolean searchWinner(Lottery l) {
		
		return false;
	}
	
}
