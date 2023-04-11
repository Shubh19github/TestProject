package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignIn {

	public void getSignIn(String username, String Password) throws SQLException {

		Connection signIn = null;
		PreparedStatement pSSignIn = null;

		try {
			ConnectionSR connectionSR = new ConnectionSR();
			signIn = connectionSR.getStudRegistration();

			pSSignIn = signIn.prepareStatement("insert into studentregistration(UserName,Password)values(?,?)");
			pSSignIn.setString(1, username);
			pSSignIn.setString(2, Password);

			int s = pSSignIn.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
