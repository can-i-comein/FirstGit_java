package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); // Tue Apr 29 09:45:52 KST 2025

		System.out.println(today.getTime());
		// 1745887627910 / Tue Apr 29 09:47:07 KST 2025

		Date time = new Date(1123457627910L);
		System.out.println(time);

		Date date = new Date(2025, 4, 29);

	}

	public void method2() {
		// Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR);
		System.out.println(year);

		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);

		int date = c.get(Calendar.DATE);
		System.out.println(date);

		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm);

		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);

		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24);

		int min = c.get(Calendar.MINUTE);
		System.out.println(min);

		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);

		int millisecond = c.get(Calendar.MILLISECOND);
		System.out.println(millisecond);

		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초\n", year, month, date, amPm == 0 ? "오전" : "오후", hour, min, sec);

	}

	public void method3() {
		
		int year = 2025;
		int month = 8;
		int date = 19;
		int hour = 17;
		int min = 50;
		int sec = 0;
		
		GregorianCalendar g = new GregorianCalendar(year, month, date, hour, min, sec);
		//System.out.println(g);
		long milli = g.getTimeInMillis();
		Date endDay = new Date(milli);
		System.out.println(endDay);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd e요일 a hh시 mm분 ss초 SS");
		String format = sdf.format(endDay);
		System.out.println(format);
		
	}
	
	
}
