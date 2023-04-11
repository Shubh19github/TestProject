package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class SignInDInput {

	public void getSignInInput() throws SQLException {

		System.out.println("Enter The UserName");
		Scanner scanner = new Scanner(System.in);
		String signInUsername = scanner.next();
		System.out.println("Enter The Password");
		String signInPass = scanner.next();

		Connection login = null;
		PreparedStatement loginup = null;
		ResultSet resultSet = null;

		try {
			ConnectionSR connectionSRR = new ConnectionSR();
			login = connectionSRR.getStudRegistration();
			loginup = login.prepareStatement("select UserName,Password from studentregistration where UserName=?");
			loginup.setString(1, signInUsername);

			String uname = "";
			String upassword = "";

			resultSet = loginup.executeQuery();

			while (resultSet.next()) {
				uname = resultSet.getString("UserName");
				upassword = resultSet.getString("Password");
			}
			if ((signInPass.equals(upassword) && (signInUsername.equals(uname)))) {

				System.out.println("Login Successfull");
				// show the questions here
			} else {
				System.out.println("Incorrect UserName or Password");
				// ithun to parat signin method kade gela pahije
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			login.close();
			loginup.close();
			resultSet.close();
		}
		SignIn signin = new SignIn();
		signin.getSignIn(signInUsername, signInPass);
	}

}
