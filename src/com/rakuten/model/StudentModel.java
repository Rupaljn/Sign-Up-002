package com.rakuten.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.rakuten.dto.Student;

public class StudentModel {
public boolean addStudent(Student student){
	boolean flag = false;
	Integer id = student.getId();
	String fullName = student.getFullName();
	String emailId = student.getEmailId();
	Long contactNumber = student.getContactNumber();
	String password = student.getPassword();
	Date createdDate = new Date();
	String createdBy = student.getCreatedBy();
	
	
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into studentd(id, name, emailId, contact_number, password, created_date, created_by) values(?, ?, ?, ?, ?, ?, ?)");
		ps.setInt(1, id);
		ps.setString(2, fullName);
		ps.setString(3, emailId);
		ps.setLong(4, contactNumber);
		ps.setString(5, password);
		ps.setDate(6, new java.sql.Date(createdDate.getTime()));
		ps.setString(7, createdBy);
		int row = ps.executeUpdate();
		if(row>0){
			flag = true;
		}
		con.close();
		
	}
	catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	
	return flag;
}
}
