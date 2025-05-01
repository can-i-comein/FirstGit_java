package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method() {
		// Person 객체가 들어갈 수 있는 5개의 공간 qArr 생성

		Person pArr[] = {new Person(),new Person("황인호", 20),
				new Person("닝냐뇽", 17, '남', 155, 67),
				new Person("도태남", 50, '여', 196, 23),
				new Person("크라라", 23)};
		
		System.out.println("pArr : " + pArr);
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		
//		pArr[0] = new Person();
//		pArr[1] = new Person("황인호", 20);
//		pArr[2] = new Person("닝냐뇽", 17, '남', 155, 67);
//		pArr[3] = new Person("도태남", 50, '여', 196, 23);
//		pArr[4] = new Person("크라라", 23);
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
	}
}
