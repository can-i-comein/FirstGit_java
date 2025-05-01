package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// 파일로부터 byte단위로 데이터를 읽어오고 싶다
		try(FileInputStream fis = new FileInputStream("a_byte.txt")) {
				
//			int data = fis.read();
//			System.out.println((char)data);
			
			// 1. byte배열에 저장한 후 출력하기
			// 1-1. byte배열 직접 생성
//			File file = new File("a_byte.txt");
//			long fileSize = file.length();
//			byte[] bArr = new byte[(int)fileSize];
//			fis.read(bArr);
//			for (int i = 0; i < bArr.length; i++) {
//				System.out.print((char)bArr[i] + " ");
//			}
			
			// 1-2. byte배열 반환 받기
//			byte[] bArr = fis.readAllBytes();
//			for (int i = 0; i < bArr.length; i++) {
//				System.out.print((char)bArr[i] + " ");
//			}
			
			// 2. byte배열을 사용하지 않고 바로 하나씩 읽어 출력
			int value= fis.read();
			while(value != -1) {
				System.out.print((char)fis.read() + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		// 파일에 byte단위로 데이터를 작성하고 싶다.
		FileOutputStream fos = null;
		try {
			//FileOutputStream fos = new FileOutputStream("a_byte.txt");
			fos.write(97);
			
			byte[] bArr = {98,99,100,101,102,103};
			fos.write(bArr);
			
			fos.write(bArr, 1, 3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public void fileSave2() {
		// 파일에 byte단위로 데이터를 작성하고 싶다.
	
		try (FileOutputStream fos = new FileOutputStream("a_byte.txt")){
			//FileOutputStream fos = new FileOutputStream("a_byte.txt");
			fos.write(97);
			
			byte[] bArr = {98,99,100,101,102,103};
			fos.write(bArr);
			
			fos.write(bArr, 1, 3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
