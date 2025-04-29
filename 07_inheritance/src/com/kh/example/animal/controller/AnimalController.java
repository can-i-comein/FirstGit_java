package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method() {
		
		Animal a = new Animal("강아지", 9 , 6.3);
		System.out.println(a);  //com.kh.example.animal.model.vo.Animal@1f32e575
//		System.out.println(a.inform());
		
		Dog d = new Dog("초코", 1, 5.2, 50, "장모");
		System.out.println(d);  //com.kh.example.animal.model.vo.Dog@2ff4acd0
//		System.out.println(d.inform());
		
		Snake s = new Snake("방울이", 5, 10.2, "빗살");
		System.out.println(s);  //com.kh.example.animal.model.vo.Snake@5caf905d
//		System.out.println(s.inform());
	}
	
	
}
