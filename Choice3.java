package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Choice3 {

	public static void getQuestions() throws SQLException {

		Connection connectionn = null;
		PreparedStatement preparedStatement = null;
		String Question;
		String Option1;
		String Option2;
		String Option3;
		String Option4;
		String Answer;
		int count = 0;

		try {
			ConnectionSR connectionJDBC = new ConnectionSR();
			connectionn = connectionJDBC.getStudRegistration();

			preparedStatement = connectionn.prepareStatement("select * from question");

			ResultSet a = preparedStatement.executeQuery();

			while (a.next()) {
				Question = a.getString("questions");
				Option1 = a.getString("option1");
				Option2 = a.getString("option2");
				Option3 = a.getString("option3");
				Option4 = a.getString("option4");
				Answer = a.getString("ans");

				System.out.println(Question);
				System.out.println(Option1);
				System.out.println(Option2);
				System.out.println(Option3);
				System.out.println(Option4);

				Scanner scanner = new Scanner(System.in);
				String ans = scanner.next();

				if (Answer.contains(ans)) {
					count++;
					//System.out.println("Answer is correct");
              }
				PreparedStatement preparedStatement2=connectionn.prepareStatement("insert into question (score)values (?)");
				preparedStatement2.setString(1, "count");
			     preparedStatement2.executeUpdate();
			}
            
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectionn.close();

		}
	}
	
	
}
	
 

