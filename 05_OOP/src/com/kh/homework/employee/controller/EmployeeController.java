package com.kh.homework.employee.controller;

import com.kh.homework.employee.vo.Employee;

public class EmployeeController {
	
	private Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
		e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone,
					String dept, int salary, double bonus) {
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		Employee temp = e;
		e = null;
		return temp;
		
		
	}
	
	public String inform() {
		if(e == null) {
			return "직원정보가 없습니다.";
		} else {
			return e.printEmployee();
		}
	}
	
	
}
