package com.gusto.mar301.main;

import java.io.BufferedReader;
import java.io.FileReader;

//txt파일 읽어오기
public class FileReaderMain {
	public static void main(String[] args) {
		// Windows는 경로에 대소문자 구분 안함
		// Linux는 대소문자 철저하게 구분

		// fr 겉으로 br를 덧 씌운 상태 
		// 하나만 닫아도 연관된 것들을 다 처리해 줌
		BufferedReader br = null;
		try {
			// 파일 -> 프로그램 (InputStreamReader 개조)
			FileReader fr = new FileReader("C:\\Users\\yt866\\Desktop\\fos\\lee1.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while ((line = br.readLine()) != null) { // 다음줄에 내용이 있으면
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
