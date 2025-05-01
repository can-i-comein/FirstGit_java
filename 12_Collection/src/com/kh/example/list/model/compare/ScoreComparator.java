package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class ScoreComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
		Integer standard = o1.getScore();
		Integer object = o2.getScore();
		return -standard.compareTo(object);
	}
}
