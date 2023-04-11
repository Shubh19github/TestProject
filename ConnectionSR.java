package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSR {

	public Connection getStudRegistration() {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapplication", "root", "root");

		} catch (Exception e) {

		}
		return connection;

	}
}
