package com.gusto.apr211.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/Output")
public class Output extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8"); << 파일 업로드할 때 처리!
		// 파라미터 읽기
//		String title = request.getParameter("title"); << 파일 업로드시에는 다른방법 사용 
		
		response.setCharacterEncoding("UTF-8");
		
		// 파일 업로드 해보자
		// 파일이 업로드 될 서버상 폴더의 절대경로
		// C:\gusto\JSPModel2\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\apr21_1_Servlet\img
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path);
		
		// 파일 업로드 준비 
		MultipartRequest mr = new MultipartRequest(
				request, path,
				10*1024*1024, // 허용할 파일의 최대크기(byte)
				"UTF-8",
				// 사용자가 업로드한 파일명이 중복될 때 자동으로 처리 
				// 중복시에 나중에 업로드한 파일 뒤에 숫자를 붙이는 방식
				new DefaultFileRenamePolicy()
				);
		
		// 파라미터 읽기
//		String t = request.getParameter("title"); 기존꺼
		String title = mr.getParameter("title");
		
		// 업로드 한 파일의 파일명 - 중복처리
		String fileName = mr.getFilesystemName("photo");
		// DB에 파일명만 저장 -> 용량을 상당히 여유있게 만드는 것을 추천함
		// f_name varchar2(200 char)
		
		// 이유: 톰캣이 한글로 된 파일명은 인식하지 못함
		// ㅋ.png -> %2A.png
		// 내 사진.png -> %2A+%as... 파일명이 엄청 불어난다.
		fileName = URLEncoder.encode(fileName,"UTF-8");
		fileName = fileName.replace("+", " ");
		
		String fileName2 = mr.getFilesystemName("etc");
		fileName2 = URLEncoder.encode(fileName2,"UTF-8");
		fileName2 = fileName2.replace("+", " ");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><title>파일업로드</title></head>");
		pw.print("<body>");
		pw.printf("<h1>제목: %s</h1>", title);
		pw.printf("<h2> 파일명 : %s</h2>", fileName);
		pw.printf("<img src='img/%s'>", fileName);
		pw.printf("<h2> 파일명 : %s</h2>", fileName2);
		pw.printf("<a href='img/%s'>다운받기</a>", fileName2);
		pw.print("</body>");
		pw.print("</html>");
		
		
		
		
		
		
		
		
		
		
	}

}
