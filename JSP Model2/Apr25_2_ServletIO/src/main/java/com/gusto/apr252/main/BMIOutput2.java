package com.gusto.apr252.main;

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

@WebServlet("/BMIOutput2")
public class BMIOutput2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path);
//		bmi = 몸무게 / (키 * 키)
//		18.5 미만 저체중
//		18.5 이상 정상
//		25 이상 과체중
//		30 이상 경도비만
//		35 이상 중증도비만
//		40 이상 고도비만
		
		/*MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "UTF-8",
				new DefaultFileRenamePolicy());
		String name = mr.getParameter("name");
		double height = Double.parseDouble(mr.getParameter("height"));
		double weight = Double.parseDouble(mr.getParameter("weight"));
		height /= 100;
		double bmi = weight / (height * height);
		
		String result = "저체중";
		if (bmi >= 40) {
			result = "고도비만";
		} else if (bmi >= 35) {
			result = "중등도비만";
		} else if (bmi >= 30) {
			result = "경도비만";
		} else if (bmi >= 25) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		}
		
		String image = mr.getFilesystemName("photo");
		image = URLEncoder.encode(image, "UTF-8");
		image = image.replace("+", " ");
		
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><title>BMI RESULT</title></head>");
		pw.print("<body>");
		pw.print("<h1>BMI결과</h1>");
		pw.printf("<h2>이름 : %s</h2>", name);
		pw.printf("<h2>키 : %.1f</h2>", height * 100);
		pw.printf("<h2>몸무게 : %.1f</h2>", weight);
		pw.printf("<h2>BMI : %.1f%%</h2>", bmi);
		pw.printf("<h1>결과 : 당신은 %s 입니다</h1>", result);
		pw.printf("<img src='img/%s' style='max-width:400px;'>", image);
		pw.print("</body>");
		pw.print("</html>");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
