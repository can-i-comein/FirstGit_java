package com.kh.example.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.MapComparator;
import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		HashMap<String, Snack> map = new HashMap<String, Snack>();
		
		//put(K key, V value):V -> map에 키와 값을 추가
		Snack value1 = map.put("새우깡", new Snack("짠맛", 1500));
		Snack value2 = map.put("다이제", new Snack("단맛", 2500));		
		Snack value3 = map.put("포테토칩", new Snack("짠맛", 3000));
		Snack value4 = map.put("고소미", new Snack("고소한맛", 1000));
		System.out.printf("%s, %s, %s, %s\n" , value1, value2,value3,value4);
		System.out.println("map : " + map);

		Snack value5 = map.put("새우깡", new Snack("매운맛", 1500));
		System.out.println(value5);
		System.out.println("map : " + map);
		
		// containsKey(Object key):boolean -> key가 존재하는지 확인
		// containsValue(Object value):boolean -> value가 존재하는지 확인
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsKey("홈런볼"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500)));
		
		// get(Object key):V -> 키의 값 반환
		System.out.println(map.get("고소미"));
		System.out.println(map.get("칸쵸"));
		
		
		System.out.println();
		
		System.out.println("1. keySet() 이용 : 모든 키를 Set에 담아 반환");
		Set<String> set1 = map.keySet();
		//System.out.println(set1);
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + "=" + map.get(key));
		}
		
		System.out.println();
		System.out.println("2. entrySet() 이용 : 모든 entry(키 + 값의 쌍)객체를 Set에 담아 변환");
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		
		System.out.println();
		
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		System.out.println("map2 : " + map2);
		
		
		Map<String, Snack> map3 = new TreeMap<String, Snack>(new MapComparator());
		map3.putAll(map);
		System.out.println("map3 : " + map3);
		
		
		//size():int -> map에 저장된 entry 수 반환
		System.out.println(map3.remove);
		
		
		
		//remove(Object key, Object value):boolean -> 키와 값이 맞으면 삭제
		boolean remove3 = map3.remove("고소미", new Snack("고소한맛", 1000));
		System.out.println(remove3);
		System.out.println("map : " + map3);
		
		//clear():void
		//isEmpty():boolean
		System.out.println("map3가 비어있니? " + map3.isEmpty());
		map3.clear();
		System.out.println("map3 : " + map3);
		System.out.println("map3가 비어있니? " + map3.isEmpty());
		
	}
	
	public void doProperties() {
		Properties prop = new Properties();
		
//		setProperty(String key, String value):Object -> Properties에 데이터 삽입
		Object result1 = prop.setProperty("채소", "오이");
		Object result2 = prop.setProperty("과일", "사과");
		Object result3 = prop.setProperty("간식", "젤리");
		System.out.printf("%s, %s, %s\n", result1, result2, result3);
		System.out.println(prop);
		
		
		Object result4 = prop.setProperty("채소", "피망");
		System.out.println(result4);
		
		//getProperty(String key):String -> key를 통해 value 변환
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		
		//getProperty(String key, String defaultValue):String
		System.out.println(prop.getProperty("채소", "땅콩"));
		System.out.println(prop.getProperty("과일", "땅콩"));
		System.out.println(prop.getProperty("간식", "땅콩"));
		System.out.println(prop.getProperty("견과", "땅콩"));
		
		
	}
	
}
