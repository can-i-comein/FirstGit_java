package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.model.compare.SetComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		HashSet<String> set = new HashSet<String>();
		
		boolean result1 = set.add("마루쉐");
		boolean result2 = set.add("자몽이");
		boolean result3 = set.add("흰둥이");
		System.out.printf("%b, %b, %b\n", result1, result2, result3);
		System.out.println("set : " + set); // 순서유지 x
		
		boolean result4 = set.add(new String("자몽이"));
		System.out.println(result4);
		System.out.println ("set : " + set); // 중복 객체 저장 x
		
		HashSet<Dog> dogSet = new HashSet<Dog>();
		dogSet.add(new Dog("바둑이", 5.5));
		dogSet.add(new Dog("누렁이", 12.3));
		dogSet.add(new Dog("흰둥이", 3.8));
		dogSet.add(new Dog("누렁이", 12.3));
		//equals 오버라이딩 안되서 중복값이 저장됨

		System.out.println(dogSet);
		
		// LinkedHastSet : 중복 저장은 안되지만 순서 유지는 가능한 Set
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("초코");
		set2.add("콩이");
		set2.add("두부");
		set2.add("초코");
		System.out.println("set2 : " + set2);
		
		set2.add("로이가 왜나와");
		set2.add("공주");
		set2.add("왕자");
		set2.add("조이");
		System.out.println("set2 : " + set2);
		
		//TreeSet : 자동 정렬되는 Set
		Set<String> set3 = new TreeSet<String>(set2);
		System.out.println("set3 : " + set3);
		
		TreeSet<String> set4 = new TreeSet<String>(new SetComparator());
		set4.addAll(set2);
		set4.add("해피");
		System.out.println("set4 : " + set4);
		
		System.out.println();
		
		// set은 index가 없기 때문에 for문을 통해 내부 요소에 접근 불가능
		// 향상된 for문은 이용가능ㅋ 
		// for(변수 : 돌릴 객체){}
//		int[] arr = new int[3];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for (int j : arr) {
//			System.out.println(j);
//		}
		System.out.println("1. 향상된 for문을 이용한 set element 접근");
		for (String str : set4) {
			System.out.println(str + " ");
		}
		
		System.out.println();
		
		System.out.println("2. set을 list화 하여 set element 접근");
		List<String> list = new ArrayList<String>(set4);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		
		System.out.println("3. set의 iterator()를 이욯나 set element 접근");
		Iterator<String> it = set4.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println("re : " + s + " ");
		}
		
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next() + " ");
		}
		System.out.println();
		while(lit.hasPrevious()) {
			System.out.println(lit.previous() + " ");
		}
		
	}
}
