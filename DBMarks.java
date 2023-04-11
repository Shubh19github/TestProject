package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBMarks {

public void getMarks() throws SQLException {
	
	
   
	/*String Answer;
	int count = 0;
	
	
	System.out.println(" Result:  ");
	System.out.println("The score is : " + count);
	int result = count;
	*/
		Connection connectionn=null;
		PreparedStatement preparedStatement=null;
	

	try{
		ConnectionSR connectionJDBC = new ConnectionSR();
	    connectionn=connectionJDBC.getStudRegistration();
	    
		preparedStatement=connectionn.prepareStatement("select * from studentregistration left join question\r\n" + 
				"on studentregistration.regid=question.id union\r\n" + 
				"select * from studentregistration right join question\r\n" + 
				"on studentregistration.regid=question.regid; score,FirstName,UserName,regid from marks order by score");
		
		//preparedStatement.setString(1, "result");
               
		ResultSet resultSet=preparedStatement.executeQuery();	
		
		while(resultSet.next()){
			
			
			System.out.println("FirstName  "+resultSet.getString("FirstName"));
			System.out.println("Your Score is  "+resultSet.getString("score"));
		}
		}
		catch(Exception e) {
		e.printStackTrace();
	}finally {
		connectionn.close();
	}
}
}
