package com.kh.example.practice5.run;

import com.kh.example.chap06_method.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmpNo(100);
		e.setEmpName("황인호");
		e.setDept("영업부");
		e.setJob("과장");
		e.setAge(20);
		e.setGender('남');
		e.setSalary(5000000);
		e.setbp(0.5);
		e.setPhone("010-4014-1770");
		e.setAddress("서울시 강남구");
	}

}
