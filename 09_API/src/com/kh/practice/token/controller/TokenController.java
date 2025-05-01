package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String no = "";
		while(st.hasMoreTokens()) {
			no += st.nextToken();
		}
		
		return no;
	}
	
	public String firstCap(String input) {
		char up = input.toUpperCase().charAt(0);
		String no ="";
		no += up;
		for (int i = 1; i < input.length(); i++) {
			no += input.charAt(i);
		}
		return no;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if(one == input.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
