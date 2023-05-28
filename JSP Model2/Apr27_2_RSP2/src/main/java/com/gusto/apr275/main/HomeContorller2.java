package com.gusto.apr275.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeContorller2")
public class HomeContorller2 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			// 주소창에 파라미터 값이 없을 경우 gif 파일을 출력한
			request.setAttribute("uh", "img/cat1.gif");
			request.setAttribute("ch", "img/cat1.gif");
		} else {
			RSPGameEngine rge = RSPGameEngine.getRge();
			rge.doRsp(request);
		}
		request.getRequestDispatcher("rsp.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
