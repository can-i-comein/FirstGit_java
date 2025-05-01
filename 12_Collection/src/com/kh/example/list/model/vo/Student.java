package com.kh.example.list.model.vo;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	
	public Student() {
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + "(" + score + "점)";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		//객체 비교
//		if(this == obj) {
//			return true;
//		}
//		if(obj == null) {
//			return false;
//		}
//		if(getClass() != obj.getClass()) {
//			return false;
//		}
//		
//		//내용 비교
//		Student other = (Student)obj;
//		if(name = null) {
//			if(other.name != null) {
//				return false;
//			}
//		}else if(!name.equals(other.name)) {
//			return false;
//		}
//		if(score != other.score) {
//			return false;
//		}
//		return super.equals(obj);
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (name == null? 0 : name.hashCode());
//		result = prime * result + score;
//				
//		return super.hashCode();
//		
//	}
	
	@Override
	public boolean equals(Object obj) {
		//객체 비교
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		//내용 비교
		Student other = (Student)obj;
		
		return Objects.equals(name, other.name) && score == other.score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}
	@Override
	public int compareTo(Student o) {
		//이름(String) 오름차순
		return name.compareTo(o.name);
	}
}
