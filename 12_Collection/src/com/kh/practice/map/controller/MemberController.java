package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		boolean result = true;
		if(!map.containsKey(id)) {
			map.put(id, m);
		} else {
			result = false;
		}
		return result;
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			String savedPw = m.getPassword();
			
			if(savedPw.equals(password))
				return m.getName();
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
		boolean result = true;
		if(map.containsKey(id)) {
			Member m = map.get(id);
			String savedPw = m.getPassword();
			if(savedPw.equals(oldPw)) {
				m.setPassword(newPw);
			} else
				result = false;
		}
		return result;
	}
	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			m.setName(newName);
		}
	}
	
	public TreeMap<String, String> sameName(String name) {
		
		TreeMap<String, String> same = new TreeMap<String, String>();
		
		
		return ;
	}
}
