package com.gusto.may242.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gusto.may242.fruit.FruitDAO;
// xml 주소 
// http://localhost/May24_1_AJAXServer/GetFruitXML

// json 주소
// http://localhost/May24_1_AJAXServer/GetFruitJSON

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FruitDAO.getFruitXML(request);
		FruitDAO.getFruitJSON(request);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
