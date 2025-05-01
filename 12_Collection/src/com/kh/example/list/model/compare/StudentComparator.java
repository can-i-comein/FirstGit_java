package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {
	
	
	@Override
	public int compare(Student o1, Student o2) {
		// 점수 오차순 + (점수 같은 경우) 이름 내림차순
		int scoreResult = ((Integer)o1.getScore()).compareTo(o2.getScore());
		if(scoreResult == 0) {
			return o2.getName().compareTo(o1.getName());
		} else
			return scoreResult;
	}
}
