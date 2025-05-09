package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
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
//			Member m = map.get(id);
//			String savedPw = m.getPassword();

			String savedPw = map.get(id).getPassword();
			
			if(savedPw.equals(password))
				return map.get(id).getName();
//			else
//				return null;
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
		if(map.containsKey(id)) {
			Member m = map.get(id);
			String savedPw = m.getPassword();
			if(savedPw.equals(oldPw)) {
				m.setPassword(newPw);
				return true;
			} else
				return false;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
//			Member m = map.get(id);
			map.get(id).setName(newName);
		}
	}
	
	public TreeMap<String, String> sameName(String name) {
		
		TreeMap<String, String> same = new TreeMap<String, String>();
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Member m = map.get(key);
			if(m.getName().equals(name)) {
				same.put(key, name);
			}
		}
		
		return same;
	}
}
