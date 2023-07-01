package com.employees.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	static final String DB_URL = "jdbc:mysql://localhost/employee_management_db";
	static final String USER = "root";
	static final String PASS = "12345678";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("employee_firstname");
		String lastName = request.getParameter("employee_lastname");
		int eId = Integer.parseInt(request.getParameter("employee_id"));
		String uname = request.getParameter("employee_username");
		String email = request.getParameter("employee_email");
		String password = request.getParameter("employee_password");
		String rePassword = request.getParameter("employee_re_password");
		String phone = request.getParameter("employee_contact");
		HttpSession session = request.getSession();
		Connection conn = null;
		PreparedStatement pstInsert = null;
		PreparedStatement pstSelect = null;
		RequestDispatcher dispatcher = null;
//		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			if(firstName == null || firstName.equals("")) {
				request.setAttribute("status", "Invalid First Name");
			} else if(eId <= 0) {
				request.setAttribute("status", "Invalid Employee ID");
			} else if(uname == null || uname.equals("")) {
				request.setAttribute("status", "Invalid Username");
			} else if(email == null || email.equals("")) {
				request.setAttribute("status", "Invalid Email");
			} else if(password == null || password.length() < 8) {
				request.setAttribute("status", "Invalid Password");
			} else if(! password.equals(rePassword)) {
				request.setAttribute("status", "Password Not Matching");
			} else if(phone == null || phone.equals("") || (phone.length() != 10)) {
				request.setAttribute("status", "Invalid Phone");
			} else {
				// to check if there are more than one person logged in with same id
				pstSelect = conn.prepareStatement("Select * from employees where employeeId = ?");
				pstSelect.setInt(1, eId);
				ResultSet rs = pstSelect.executeQuery();
				if(rs.next()) {
					request.setAttribute("status", "User exists");
				} else {
					// Inserting Data
					pstInsert = conn.prepareStatement("Insert into employees(employeeId, employeeUsername, employeePassword, employeeFirstName, employeeLastName, employeeEmail, employeeMobile) values (?, ?, ?, ?, ?, ?, ?);");
					pstInsert.setInt(1, eId);
					pstInsert.setString(2, uname);
					pstInsert.setString(3, password);
					pstInsert.setString(4, firstName);
					pstInsert.setString(5, lastName);
					pstInsert.setString(6, email);
					pstInsert.setString(7,phone);
					int rowCount = pstInsert.executeUpdate();
					if(rowCount > 0) {
						System.out.println("hello3");
						request.setAttribute("status", "success");
						dispatcher = request.getRequestDispatcher("login.jsp");
						dispatcher.forward(request, response);
					} else {
						request.setAttribute("status", "failed");
						System.out.println("Insertion unsuccessful");
					}
				}
			}
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}