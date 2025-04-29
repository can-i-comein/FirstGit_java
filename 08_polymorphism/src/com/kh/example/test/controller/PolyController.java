package com.kh.example.test.controller;

import java.util.Iterator;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class PolyController {
	public void method() {
		System.out.println("1. 부모 타입 래퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		// 부모타입 레퍼런스	부모객체
		p1.printParent();
		
		System.out.println();
		
		System.out.println("2. 자식 타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		// 자식타입 레퍼런스	자식객체
		c1.printChild1();	
		c1.printParent();	
		//c1 레퍼런스 변수로 Child1, Parent에 접근
		
		System.out.println();
		
		System.out.println("3. 부모 타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2();
		p2.printParent();
		// p2.printChild2();
		((Child2)p2).printChild2(); // 다운 캐스팅
		
		System.out.println();
		
		System.out.println("4. 자식 타입 레퍼런스로 부모 객체를 다루는 경우");
		//Child2 c2 = new Parent();
		//Child2 c2 = (Child2)(new Parent());
		//Child2 c2 = (Child2)p1;
		
		System.out.println();
		System.out.println("=====다형성 간단 예제=====");
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		
		//pArr안에 담긴 객체를 이용해서 printChild1()/printChild2() 호출
		
		((Child1)pArr[0]).printChild1();
		((Child2)pArr[1]).printChild2();
		((Child2)pArr[2]).printChild2();
		((Child1)pArr[3]).printChild1();
		
		for (int i= 0; i < pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			} else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		
	}
	
}
