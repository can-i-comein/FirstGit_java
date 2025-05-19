package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.EmployeeDAO;
import com.kh.model.vo.Employee;
import com.kh.view.Menu;

public class EmployeeController {
	private EmployeeDAO empDAO = new EmployeeDAO();
	private Menu menu = new Menu();
	
	public void selectAll() {
		ArrayList<Employee> list = empDAO.selectAll();
		
		if(list.isEmpty()) {
			menu.displayError("조회 결과가 없습니다.");
		} else {
			menu.selectAll(list);
		}
	}

	public void selectEmployee() {
		int empNo = menu.selectEmpNo();
		
		// 완성형 쿼리 버전
		// Employee e = empDAO.selectEmployee(empNo);
		
		// 미완성형 쿼리 버전
		Employee e = empDAO.selectEmployee2(empNo);
		
		if(e != null) {
			menu.selectEmployee(e);
		} else {
			menu.displayError("해당 사번의 검색 결과가 없습니다.");
		}
	}
	
}
