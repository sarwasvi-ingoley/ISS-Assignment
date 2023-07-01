package com.employees.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String DB_URL = "jdbc:mysql://localhost/employee_management_db";
	static final String USER = "root";
	static final String PASS = "12345678";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public LoginServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eID = Integer.parseInt(request.getParameter("employee_id"));
		String password = request.getParameter("employee_password");
		Connection conn = null;
		PreparedStatement pst = null;
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		
		if(eID <= 0 ) {
			request.setAttribute("status", "Invalid Email ID");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		
		if(password == null || password.equals("")) {
			request.setAttribute("status", "Invalid Password");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			pst= conn.prepareStatement("Select * from employees where employeeId=? and employeePassword=? ");
			pst.setInt(1, eID);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("eID", rs.getInt("employeeId"));	
				dispatcher = request.getRequestDispatcher("index.jsp");
			} else {
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
