package com.velocity.mini.project1.quiz.application;

import java.util.Scanner;

public class Console {

	static {
		System.out.println("**********  Welocome To Quiz Basesd Application  ************");
	}

	public void getConsole() {

		System.out.println(" ");
		System.out.println("1. Student Registration");
		System.out.println("2. Student Login");
		System.out.println("3. Here Are Java Questions");
		System.out.println("4. Submit your Quiz");
		System.out.println("5. See Your Result");
		System.out.println("6. All Student Score ");
		System.out.println("7. Enter Student Id To see Score");
		System.out.println("8. Enter the Question");

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Your Choice");
			int choice = scanner.nextInt();

			UserChoice userChoice = new UserChoice();
			userChoice.getOperation(choice);

		} catch (Exception e) {
			System.out.println("Inavalid Input!!!");
		} finally {
			scanner.close();
		}
	}

}
