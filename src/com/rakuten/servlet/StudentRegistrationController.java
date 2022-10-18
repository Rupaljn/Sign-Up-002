package com.rakuten.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rakuten.dto.Student;
import com.rakuten.exceptions.DataInvalidException;
import com.rakuten.model.StudentModel;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/StudentRegistrationController")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentRegistrationController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String fullName = request.getParameter("fullName");
	String emailId = request.getParameter("emailId");
	String contactNumber = request.getParameter("contactNumber");
	String password = request.getParameter("password");
	
	long cn = Long.parseLong(contactNumber);
	Student ur = new Student();
	
	try{
	ur.setFullName(fullName);
	ur.setEmailId(emailId);
	ur.setContactNumber(cn);
	ur.setPassword(password);
	}
	
	catch(DataInvalidException d){
		d.printStackTrace();
		String errorMsg = d.getMessage();
		request.setAttribute("errorMsg", errorMsg);
		RequestDispatcher rd = request.getRequestDispatcher("HomeView.jsp");
		rd.forward(request, response);
		return;
	}
	StudentModel um = new StudentModel();
	boolean flag = um.addStudent(ur);
	
	if(flag==true){
		String successMsg = "Sign Up is successfull";
		request.setAttribute("successMsg", successMsg);
		RequestDispatcher rd = request.getRequestDispatcher("HomeView.jsp");
		rd.forward(request, response);
	}
	else{
		String errorMsg = "Sign Up is not successfull";
		request.setAttribute("errorMsg", errorMsg);
		RequestDispatcher rd = request.getRequestDispatcher("HomeView.jsp");
		rd.forward(request, response);
	}
	
	
	
	}

}
