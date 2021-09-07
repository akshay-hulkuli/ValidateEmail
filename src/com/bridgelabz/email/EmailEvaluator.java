package com.bridgelabz.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailEvaluator {
	
	public static boolean emailValidator(String email) {
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-z|A-Z|0-9])(@[a-zA-Z0-9]*)(.)([a-z]{2,})");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		System.out.println("email Evaluator \nenter an email id");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		
		if(emailValidator(email))System.out.println("It is a valid email id");
		else System.out.println("It is an invalid email id");

		sc.close();
	}
}
