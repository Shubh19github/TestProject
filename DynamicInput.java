package com.velocity.mini.project1.quiz.application;

import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInput {

	public static void getUserInput() throws SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Firstname");
		String Firstname = scanner.next();
		System.out.println("Enter the lastname");
		String Lastname = scanner.next();
		System.out.println("Enter the Username");
		String Username = scanner.next();
		System.out.println("Enter the Password");
		String Password = scanner.next();
		System.out.println("Enter the City");
		String City = scanner.next();
		System.out.println("Enter the Mail Id");
		String MailId = scanner.next();
		System.out.println("Enter the Mobile Number");
		String MNumber = scanner.next();

		StudentRegistration studentRegistration = new StudentRegistration();
		studentRegistration.getRegister(Firstname, Lastname, Username, Password, City, MailId, MNumber);

	}

	
}