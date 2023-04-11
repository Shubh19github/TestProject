package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRegistration {
	
	public void getRegister(String firstname,String lastname,String username,String password,String city,String mail,String mnumber) throws SQLException {
		
		Connection connectionn=null;
		PreparedStatement preparedStatement=null;
		
		try{
			ConnectionSR connectionSR = new ConnectionSR();
		    connectionn=connectionSR.getStudRegistration();
			
			 preparedStatement=connectionn.prepareStatement("insert into studentregistration(FirstName,LastName,UserName,Password,City,MailId,MobileNumber)values(?,?,?,?,?,?,?)");
			preparedStatement.setString(1, firstname);
			preparedStatement.setString(2, lastname);
			preparedStatement.setString(3, username);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, city);
			preparedStatement.setString(6, mail);
			preparedStatement.setString(7, mnumber);
			
			int a=preparedStatement.executeUpdate();
			System.out.println("Registration Is Successful");
		}catch(Exception e) {
			
		}finally {
			connectionn.close();
			preparedStatement.close();
		}
	}
}
