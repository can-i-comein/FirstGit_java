package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.ListComparator;
import com.kh.example.list.model.compare.ScoreComparator;
import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	
	public void doList() {
		ArrayList l = new ArrayList();
		ArrayList<String> list = new ArrayList<String>(3);
		
		// add(E e): boolean -> 리스트 끝에 데이터 삽입
		list.add(new String("테스트"));
		list.add("류라라");
		list.add("도대담");
		list.add("강건강");
		list.add("하현호");
		
		System.out.println("list : " + list);
		System.out.println("list에 담긴 element 개수 : " + list.size());
		
		// add(int index, E e):void -> index번째에 E 추가
		list.add(0, "문미미");
		System.out.println("list : " + list);
		System.out.println("list에 담긴 element 개수 : " + list.size());
		
		// remove(int index):E -> index번째 객체 삭제
		String remove = list.remove(1);
		System.out.println("remove : " + remove);
		System.out.println("list : " + list);
		
		// remove(Object o):boolean -> 일치하는 객체 삭제
		boolean remove2 = list.remove("강건강");
		System.out.println("remove2 : " + remove2);
		System.out.println("list : " + list);
		
		boolean remove3 = list.remove("강건강");
		System.out.println("remove2 : " + remove3);
	

	//-----------------------------------------------------
	ArrayList<Student> studentList = new ArrayList<Student>();
	studentList.add(new Student("박보배", 100));
	studentList.add(new Student("강건강", 50));
	studentList.add(new Student("차정준", 70));
	System.out.println(studentList);
	
	studentList.remove(0);
	System.out.println(studentList);
	studentList.remove(new Student("강건강", 50));
	//해결방법 : Student클래스 내 equals() 오버라이딩
	System.out.println(studentList);
	
	
	studentList.add(new Student("류라라", 20));
	studentList.add(new Student("송성실", 90));
	System.out.println(studentList);
	
	
	//remove메소드 사용하지 않고 삭제
	for(int i = 0 ; i < studentList.size(); i++) {
		Student std = studentList.get(i);
		if(std.getName().equals("류라라") && std.getScore() ==20) {
			studentList.remove(i);
			break;
		}
	}
	System.out.println(studentList);
	//--------------------------------------------------------------
	
	System.out.println();

	// 정렬 1. Collections 클래스 이용
	System.out.println("list : " + list);
	Collections.sort(list);
	System.out.println("list : " + list);
	
	Collections.sort(list, new ListComparator());
	// = list.sort(new ListComparator());
	System.out.println("list : " + list);
	
	studentList.add(new Student("윤예의", 60));
	studentList.add(new Student("박보배", 80));
	studentList.add(new Student("정재주", 70));
	System.out.println(studentList);
	
	
	// Student클래스에 정렬 기준 세우기
	// 1. 이름 오름차순
	Collections.sort(studentList);
	System.out.println(studentList);
	
	
	// 2. 점수 내림차순
	studentList.sort(new ScoreComparator());
	System.out.println(studentList);
	
	// 3. 점수 내림차순 + 이름 오름차순
	Collections.sort(studentList, new StudentComparator());
	System.out.println(studentList);
	
	System.out.println();
	
	System.out.println("list : " + list);
	//set (int index, E e ):E -> index번째 요소를 e로 수정
	String set = list.set(3,"문미미");
	System.out.println(set);
	System.out.println("list : " + list);
	
	//get(int index):E -> index번째 요소를 가지고 옴
	String get = list.get(1);
	System.out.println(get);
	System.out.println("list : " + list);
	
	//subList(int index1, int index2):List<E> -> index1부터 index2까지의 리스트 반환
	List<String> subList = list.subList(0,3);
	System.out.println(subList);
	
	// retainAll(Collection c):boolean -> c와 겹치는 부분 빼고 모두 삭제
	boolean retain = list.retainAll(subList);
	System.out.println(retain);
	System.out.println("list : " + list);
	
	//contains(Object o):boolean -> o가 리스트에 존재하는지 검색
	System.out.println(list.contains("문미미"));
	System.out.println(list.contains("강건강"));
	System.out.println(studentList.contains(new Student("윤예의", 60)));
	
	//indexOf(Object o):int -> o가 리스트에 위치하는 인덱스 번호 반환
	System.out.println(list.indexOf("문미미"));
	System.out.println(list.indexOf("강건강"));
	System.out.println(studentList.indexOf(new Student("윤예의", 60)));
	
	//clear() : void -> 저장된 모든 객체 삭제
	//isEmpty():boolean -> 리스트가 비었는지 확인
	System.out.println("list : " + list);
	System.out.println(list.isEmpty());
	list.clear();
	System.out.println("list : " + list);
	System.out.println(list.isEmpty());
	
	}
	
}