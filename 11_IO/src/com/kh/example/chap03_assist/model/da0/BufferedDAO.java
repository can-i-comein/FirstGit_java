package com.kh.example.chap03_assist.model.da0;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDAO {
	public void inputByte() {
		//파일에 있는 데이터를 바이트 기반으로 빠르게 읽어오고 싶다.
		// File				Stream				Input
		// 							 Buffered
		try (FileInputStream fis = new FileInputStream("c_buffer.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);){
			
			int value;
			while((value = bis.read()) != -1) {
				System.out.println((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
	}
	
	public void outputByte() {
		//파일에 바이트 기반으로 데이터를 빠르게 쓰고 싶다.
		// File		Stream		Output
		//					Buffered
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c_buffer.txt"));) {
			bos.write(65);
			byte[] bArr = {66, 67, 68 ,69};
			bos.write(bArr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
	
	public void outputChar() {
		// 파일에 문자 기반으로 빠르게 데이터를 쓰고 싶다.
		// File		(Stream x) 			Writer
		//						Buffered
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));) {
			bw.write("하이용\n");
			bw.write("반갑습니다.\n");
			bw.write("또보자\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void inputChar() {
		//파일에 문자 기반으로 데이터를 빠르게 읽고 싶다.
		// File 	(Stream x) 			Reader
		//						Buffered
		
		try(FileReader fr = new FileReader("c_buffer.txt");
				BufferedReader br = new BufferedReader(fr)) {
			String value;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
