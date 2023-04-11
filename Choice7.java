package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Choice7 {

	public void getChoice7() throws SQLException {

		System.out.println("Enter The Student ID");
		Scanner scanner = new Scanner(System.in);
		String sID = scanner.next();

		Connection scoreByID = null;
		PreparedStatement sByID = null;
		ResultSet resultSet = null;

		try {
			ConnectionSR connectionSRR = new ConnectionSR();
			scoreByID = connectionSRR.getStudRegistration();
			sByID = scoreByID.prepareStatement("select score from marks where id=?");
			sByID.setString(1, sID);

			String id = "";
			String score = "";

			resultSet = sByID.executeQuery();
			while (resultSet.next()) {
				score = resultSet.getString("score");
				System.out.println("Score is>>" + score);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scoreByID.close();
			sByID.close();
			resultSet.close();
		}
	}
}
