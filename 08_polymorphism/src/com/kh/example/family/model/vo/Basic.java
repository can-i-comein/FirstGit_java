package com.kh.example.family.model.vo;

import java.io.Serializable;

//	추상클래스 구현 (상속) : extends
//	인터페이스 구현 : implements
//	인터페이스 상속 : extends

public interface Basic extends Cloneable, Serializable {
	//							마커 인터페이스 : 구현이 목적이 아닌 클래스의 특성을 나타내주기 위해 사용됨
	public static final int num = 10;
	double PI = 3.14;
	
	public abstract void sleep(); //
	void breathe();
	
	public default void test() {
		
	}
}
