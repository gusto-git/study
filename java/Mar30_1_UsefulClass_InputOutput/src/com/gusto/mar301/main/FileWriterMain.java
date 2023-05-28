package com.gusto.mar301.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

// CPU : 연산장치
// RAM : 저장장치(임시) - 재부팅하면 날아감 
//                      - Static / Stack : 프로그램 끄면(종료하면) 날아감
//                      - heap : 자동으로 날아가지 않음(GC가 있으면 자동으로 처리 해줌)
// HDD(SSD) : 저장장치(영구) - 파일
// GPU : 그래픽처리용(CPU + RAM + HDD)

// 프로그램에서는 데이터를 외부에서 읽고, 다시 외부로 출력하는 작업이 가능
// 데이터는 사용자로부터 키보드를 통해 입력될 수 있고(Scanner), 
// 파일, 네트워크에서도 입력될 수 있다.(Input)

// 반대로, 데이터는 모니터를 통해 출력될 수도 있고(System.out.println)
// 파일, 네트워크로도 출력될 수 있다.(Output)

// System.in -> InputStream
// System.out -> PrintStream

// Stream : 통로 , 빨대 (데이터가 옮겨지는 통로)
// 기본형
// 		InputStream : 장치(키보드, 파일, 네트워크 ..) -> 프로그램으로 입력(1Byte씩 이동)
//		InputStreamReader : 장치 -> 프로그램(2Byte씩) : 통로(빨대)의 크기 UP!
//		BufferedReader : (1String - line(한줄)) : 통로(빨대)의 크기 UP! *** 가장 많이 사용한다.

//		OutputStream : 프로그램의 결과를 -> 장치로 출력(1Byte씩)
//		OutputStreamWriter : 프로그램의 결과(2Byte씩) -> 장치 : 통로(빨대)의 크기 UP!
//		BufferedWriter : 프로그램의 결과(1String - line(한줄)) -> 장치: 통로(빨대)의 크기 UP! *** 가장 많이 사용한다.
// 개조형(특수 목적형)
//		PrintStream(OutputStream 개조) : 쓰기 편하게 유용한 메소드를 추가한 것
//		FileReader(InputStreamReader 개조) : 파일에서 데이터 읽어오기 편하게 만든 것
//		FileWriter(OutputStreamWriter 개조) : 데이터 출력하기 편하게 만든 것

public class FileWriterMain {
	public static void main(String[] args) {
		// System.in : 콘솔창(장치) -> 프로그램(InputStream)
		// JDK1.5에서 Scanner 기능 추가 ! 
		// InputStream 사용이 편하게 서포트
		Scanner k = new Scanner(System.in);
		System.out.println("입력 : ");
		String cmt = k.next();
		
		// System.out : 프로그램 -> 콘솔창(PrintStream)
		System.out.println("-------------------");
		
//		FileWriter
//			프로그램에서 파일 형태(OutputStreamWriter의 개조형)
//			파일이 없으면 파일을 생성해준다.
//			폴더는 생성하지 않음
//			Linux 경로 : "C:/Users/yt866/Desktop/fos/lee1.txt" -> /로 경로설정해야한다.
//			Windows 경로 : "C:\\Users\\yt866/Desktop/fos/lee1.txt" -> / 또는 \\로 경로 설정해야한다.
//			Java에서 \는 이스케이프 문자에 사용이 된다.(\r,\n,\t...)
//			%%로 % 만들 듯이 \\로 \를 만든 것

//			권한, 폴더명에 오타가, .... 있으면 -> 예외처리하기 위해 try-catch에 넣어서 작성한다.
		
		
		// fw위에 bw를 감싼 상태
		// 연관된 것들 중에 하나만 닫으면 다 처리 된다. 
		// bw를 닫으면 fw도 같이 닫힌다는 뜻
		BufferedWriter bw = null; // 나중에 닫아야해서 밖에다가 생성
		try {
			// 경로에 지정된 lee1.txt 파일 이미 존재하면 덮어씀 
			// 기존에 있던 파일 속 데이터(내용)가 사라진다.
			// 기존에 있던 내용 뒤로 덧붙이고 싶으면(데이터를 추가하고 싶으면)
			// 두번째 파라미터에 값으로 true를 주면 된다.
			
			// Encoding 방식 지정 X -> ANSI(미국 표준)로 인코딩 됨
			FileWriter fw = new FileWriter("C:\\Users\\yt866/Desktop/fos/lee1.txt", true); // /는 1개 \\ 두개 
			// 한 바이트 씩 입력하기 보다는
			// '버퍼'를 이용해서 한번에 여러 바이트를 입출력하는 것이 빠름
			//  -> 대부분의 입출력 작업에서 사용 
			//  버퍼 : CPU와 HDD 사이에서 사용되는 임시저장 공간
			//	버퍼링 : <데이터>를 버퍼로 저장하는 동작
			
			bw = new BufferedWriter(fw);
			
			bw.write(cmt + "\r\n");
			bw.write("========\r\n");
			bw.flush(); // 버퍼를 쓰면 무조건 써야함 용도: 버퍼용량이 다 채워지지 않아도 강제적으로 내보내기(모든 데이터 내보내기)
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
