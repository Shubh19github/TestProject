package com.velocity.mini.project1.quiz.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class SetQuestions {

	public void setQuestions(String question, String option1, String option2, String option3, String option4)
			throws SQLException {

		Connection questions = null;
		PreparedStatement preparedStatement = null;

		try {
			ConnectionSR connectionQuestion = new ConnectionSR();
			questions = connectionQuestion.getStudRegistration();

			preparedStatement = questions.prepareStatement(
					"insert into question(questions, option1, option2, option3, option4)values(?,?,?,?,?)");
			preparedStatement.setString(1, question);
			preparedStatement.setString(2, option1);
			preparedStatement.setString(3, option2);
			preparedStatement.setString(4, option3);
			preparedStatement.setString(5, option4);

			int a = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			questions.close();
			preparedStatement.close();

		}
	}
}
