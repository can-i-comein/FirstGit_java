package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private String ACADEMY = "KH";
	private char classRoom;
	private String time;
	private static double score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getACADEMY() {
		return ACADEMY;
	}

	public char getclassRoom() {
		return classRoom;
	}

	public void setclassRoom(char classRoom) {
		this.classRoom = classRoom;
	}

	public String gettime() {
		return time;
	}

	public void settime(String time) {
		this.time = time;
	}

	public static double getscore() {
		return score;
	}

	public void setscore(double score) {
		Trainee.score = score;
	}

	public Trainee() {

	}

	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;
	}

	public String inform() {
		return "ACADEMY " + name + "훈련생은 " + classRoom + "반 " + time + "이고, " + score + "점입니다.";
	}

}
