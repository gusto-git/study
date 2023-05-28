package com.gusto.apr265.main;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class M {
//cos.jar파일필수
	public static void calculate(HttpServletRequest request) {
		try {
			String path = request.getServletContext().getRealPath("img"); //이미 파일을 저장하는 공간 경로 만드는것
			System.out.println(path); // 확인용
			
			MultipartRequest mr = new MultipartRequest(request, path, 30*1024*1024, "UTF-8", new DefaultFileRenamePolicy()); // jar파일이 있어야 쓸수있따
			
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
			} else if (bmi >= 25) {
				result = "과체중";
			} else if (bmi >= 18.5) {
				result = "정상";
			}
			
			// height, weight, bmi -> 더블이라서, 고쳐서간다
			// ${}에 넣기위함
			
			height *= 100;
			String height2 = String.format("%.2f", height);
			double height3 = Double.parseDouble(height2);
			
			String weight2 = String.format("%.2f", weight);
			double weight3 = Double.parseDouble(weight2);
			
			String bmi2 = String.format("%.2f", bmi);
			double bmi3 = Double.parseDouble(bmi2);
			
			String image = mr.getFilesystemName("photo");
			image = URLEncoder.encode(image, "UTF-8");
			image = image.replace("+", " ");
			
			Guest g = new Guest(name, height3, weight3, bmi3, result, image);
			request.setAttribute("g", g);
			
			
			// 자바빈을 만들경우 이거 필요없다 
//			request.setAttribute("name", name);
//			request.setAttribute("height", height3);
//			request.setAttribute("weight", weight3);
//			request.setAttribute("bmi", bmi3);
//			request.setAttribute("image", image);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
	
}
