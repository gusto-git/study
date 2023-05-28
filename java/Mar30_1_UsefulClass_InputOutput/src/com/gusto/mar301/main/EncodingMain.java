package com.gusto.mar301.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileLockInterruptionException;

public class EncodingMain {
	// Encoding : 정보의 혀애나 형식을 변환하는 형식
	// 컴퓨터 : 전자기계(전기가 흐르거나, 흐르지 않거나)
	// 'ㅋ'를 전기의 흐름으로 표현 -> Encoding
	
	// Decoding : 인코딩 된 데이터 통신 전송 및 파일을 원래 상태로 변환
	// 전기의 흐름 -> 'ㅋ' -> decoding
	
	// Encoding 방식에는 여러 종류가 있다.
	// 아침 - A -> 1010 - A -> 아침
	// 아침 - B -> 0101 - C -> 저녁
	// 아침 - C -> 0100 - ? -> ?!?!?
	
	// 전 세계적으로 주력 : UTF-8(Unicode Transform Format)
	// 한국 주력 : EUC-KR
	// MicroSoft : MS949
	// 인코딩을 따로 지정하지 않으면 OS에서 사용하는 인코딩으로 데이터를 저장한다. Windows는 MS949 형식 
	public static void main(String[] args) {
//		FileOutputStream fos = null;
//		try { // 빈파일 생성 또는 파일이 있을경우 해당 파일을 찾아주는 역할을 한다.
//			fos = 
//			  new FileOutputStream("C:\\Users\\yt866\\Desktop\\fos\\lee.txt", true);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		OutputStreamWriter osw = null;
//		try { // 인코딩 방식 설정 
//			osw = new OutputStreamWriter(fos, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		BufferedWriter bw = null;
//		try {
//			bw = new BufferedWriter(osw);
//			bw.write("오늘 점심은 뭐먹지");
//			bw.append("\r\n돈까스 어떰");
//			bw.append("\r\n별로인듯");
//			bw.append("\r\n휠렛버거가자");
//			bw.flush();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		// inputStream : 다양한 소스로 부터 데이터를 읽어오기 위한 추상 클래스
		// 내가 만든 파일 가져오기
		BufferedReader br = null; // 한 줄씩 데이터를 읽어오는 역할
		try { // try 안에서 만든 변수는 밖에서 쓸수 없다.
			FileInputStream fis = new FileInputStream("C:\\Users\\yt866\\Desktop\\fos\\lee.txt"); // 파일로부터 데이터를 읽어오기 위한 클래스
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // inputSteam을 Reader로 변환해주는 역할 
			br = new BufferedReader(isr);
			String line = null; // 한줄 한줄 읽을 때 임시적으로 담을 공간 , 내부에서 쓰기 때문에 try 내부에 변수 생성
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
