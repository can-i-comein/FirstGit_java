package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	HashSet<String> lottery = new HashSet<>();
	HashSet<String> win = new HashSet<>();
	// 제네릭이 Lottery가 아니고 String인 이유
	// HashSet은 중복을 허용하지 않기 때문에 Lottery객체의 toString값이 동일하면
	// 중복으로 간주. 이 방식은 equals/hashCode를 오버라이딩 하지 않아도
	// 문자열 기준으로 비교가 가능하다는 장점

	public boolean insertObject(Lottery l) {
		boolean result = lottery.add(l.toString());
		return result;
	}

	public HashSet<String> selectAll() {
		return lottery;
	}

	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l.toString());
		if(result == true && win.contains(l.toString()))
			win.remove(l.toString());
		return result;
	}

	public HashSet<String> winObject() {
		
		if(lottery.size() < 4)
			return null;
		else {
			ArrayList<String> list = new ArrayList<>(lottery);
			while(win.size() != 4) {
				int num = (int)(Math.random() * list.size());
				win.add(list.get(num));
			}
			return win;
		}
	}

//	public TreeSet sortedWinObject() {
//
//		return ;
//	}

	public boolean searchWinner(Lottery l) {
		boolean result = win.contains(l.toString());
		return result;
	}
}
