package com.kh.example.chap02_char.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		// 데이터를 파일에 문자단위로 쓰고 싶다
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
			fw.write("히조나미연두");
			fw.write(65);
			fw.write(' ');

			char[] chArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(chArr);

			// FileWriter/FileReader는 버퍼(buffer, 임시저장공간) 사용
			// 버퍼에 데이터가 꽉 차야지만 파일에 보내주고 읽어올 수 있음
			// fw.flush(); //버퍼에 데이터가 꽉 차기 전에 버퍼에 있는 데이터를 미는 역할
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileOpen() {
		// 파일로 부터 문자단위로 데이터를 읽어오고 싶다.
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
//			int value = fr.read();
//			while(value != -1) {
//				System.out.print((char)value);
//			}

			File f = new File("b_char.txt");
			int size = (int) f.length();
			char[] chArr = new char[size];
			for (int i = 0; i < chArr.length; i++) {
				System.out.println(chArr[i] + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileSave2() {
		// 데이터를 파일에 문자단위로 쓰고 싶다

		try (FileWriter fw = new FileWriter("b_char.txt")) {

			fw.write("히조나미연두");
			fw.write(65);
			fw.write(' ');

			char[] chArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(chArr);

			// FileWriter/FileReader는 버퍼(buffer, 임시저장공간) 사용
			// 버퍼에 데이터가 꽉 차야지만 파일에 보내주고 읽어올 수 있음
			// fw.flush(); //버퍼에 데이터가 꽉 차기 전에 버퍼에 있는 데이터를 미는 역할
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen2() {
		// 파일로 부터 문자단위로 데이터를 읽어오고 싶다.
		try (FileReader fr = new FileReader("b_char.txt")) {
//			int value = fr.read();
//			while(value != -1) {
//				System.out.print((char)value);
//			}

			File f = new File("b_char.txt");
			int size = (int) f.length();
			char[] chArr = new char[size];
			for (int i = 0; i < chArr.length; i++) {
				System.out.println(chArr[i] + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
