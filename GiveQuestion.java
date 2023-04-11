package com.velocity.mini.project1.quiz.application;

import java.sql.SQLException;
import java.util.Scanner;

public class GiveQuestion {

	public void giveQuestion() throws SQLException {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Question");
		String q = scanner.next();
		System.out.println("Enter the 1st option");
		String o1 = scanner.next();
		System.out.println("Enter the 2nd option");
		String o2 = scanner.next();
		System.out.println("Enter the 3rd option");
		String o3 = scanner.next();
		System.out.println("Enter the 4th option");
		String o4 = scanner.next();
		

		SetQuestions setQuestions = new SetQuestions();
		setQuestions.setQuestions(q , o1, o2, o3, o4);

	}


	}
	
