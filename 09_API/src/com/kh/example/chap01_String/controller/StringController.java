package com.kh.example.chap01_String.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3));
		
		System.out.println("str1과 str3의 값은 같은가? : " + (str1.equals(str3)));
		
		// hashCode : 해싱기법으로 구현한 클래스에서 key값으로 값을 저장하거나 읽어올 때 사용
		// 해싱기법 : 주소값을 가지고서 해시코드화
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		
	}
	
	public void method3() {
		String str = "Hello World";
		
		// 1. charAt(int index) : char
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// 2. concat(String str) : String
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		str += "!!!";
		System.out.println(str);
		
		// 3. equals(Object anObject) : boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		
		// 4. substring(int index) : String
		//	  substring(int beginIndex, int endIndex) : String
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("str.substring(0,4) : " + str.substring(0,4));
		
		// 5. replace(char oldChar, char newChar) : String
		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));
		
		// 6. toUpperCase()/toLowerCase() : String
		String up = str.toUpperCase();
		String down = str.toLowerCase();
		System.out.println("str.toUpperCase() : " + up);
		System.out.println("str.toLowerCase() : " + down);
		
		// 7. equalsIgnoreCase(String anotherString) : boolean
		System.out.println("up.equals(down) : " + up.equals(down));
		System.out.println("up.equalsIgnoreCase(down) : " + up.equalsIgnoreCase(down));
		
		// 8. trim():String
		String str2 = "		Java";
		String str3 = "     Java";
		String str4 = "  Ja  va   ";
		System.out.println(str2 + " : " + str2.trim());
		System.out.println(str3 + " : " + str3.trim());
		System.out.println(str4 + " : " + str4.trim());
		
		// 9. split(String str):String[]
		String splitStr = "Apple, Banana, Carrot, Dill, Eggplant";
		String[] splitArr = splitStr.split(", ");
		System.out.println(Arrays.toString(splitArr));
		
		// StringTokenizer
		String stStr = "Red, Pink, Purple, Yellow, Orange";
		StringTokenizer st = new StringTokenizer(stStr,", ");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) { // 다음 token 더 있니?
			System.out.println(st.nextToken());
		}
		
		System.out.println(st.countTokens());
	}

}
