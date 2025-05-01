package com.kh.example.list.model.compare;

import java.util.Comparator;

public class ListComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//내림차순 
		//1. return -o1.compareTo(o2);
		//2. 
		return o2.compareTo(o1);
	}
	
}
