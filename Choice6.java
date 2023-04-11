package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Choice6 {

	public void getChoice6() throws SQLException {

		System.out.println("Enter The FirstName");
		Scanner scanner = new Scanner(System.in);
		String fname = scanner.next();
		System.out.println("Enter The Lastname");
		String lname = scanner.next();

		Connection scoreByName = null;
		PreparedStatement sByName = null;
		ResultSet resultSet = null;

		try {
			ConnectionSR connectionSRR = new ConnectionSR();
			scoreByName = connectionSRR.getStudRegistration();
			sByName = scoreByName
					.prepareStatement("select FirstName,LastName from studentregistration where UserName=?");
			sByName.setString(1, fname);

			String name = "";
			String lastname = "";

			resultSet = sByName.executeQuery();
			while (resultSet.next()) {
				name = resultSet.getString("FirstName");
				lastname = resultSet.getString("LastName");
			}
			if ((fname.equals(name) && (lname.equals(lastname)))) {

				System.out.println("Score is>>");

			} else {
				System.out.println("Incorrect FirstName or LastName");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scoreByName.close();
			sByName.close();
			resultSet.close();
		}
	}
}
