package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		int area = height * width;
		String areaStr = Integer.toString(area);
		
		return r.toString() + " / " + areaStr;
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		int per = 2 * (height + width);
		String perStr = Integer.toString(per);
		
		return r.toString() + " / " + perStr;
	}
}
