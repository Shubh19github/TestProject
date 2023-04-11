package com.velocity.mini.project1.quiz.application;

import java.sql.SQLException;

public class UserChoice {

	public void getOperation(int choice) throws SQLException {

		if (choice == 1) {

			DynamicInput dynamicInput = new DynamicInput();
			dynamicInput.getUserInput();

		} else if (choice == 2) {

			try {

				SignInDInput signInDInput = new SignInDInput();
				signInDInput.getSignInInput();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (choice == 3) {

			Choice3 choice3 = new Choice3();
			choice3.getQuestions();
			
		} else if (choice == 4) {
			
			
			DBMarks dBMarks = new DBMarks();
			dBMarks.getMarks();
			
		} else if (choice == 5) {

			Choice5 choice5 = new Choice5();
			choice5.getChoice5();
			
		} else if (choice == 6) {

			Choice6 choice6 = new Choice6();
			choice6.getChoice6();
		} else if (choice == 7) {

			Choice7 choice7 = new Choice7();
			choice7.getChoice7();

		} else if (choice == 8) {

			GiveQuestion giveQuestion = new GiveQuestion();
			giveQuestion.giveQuestion();
			
		}

	}

}
