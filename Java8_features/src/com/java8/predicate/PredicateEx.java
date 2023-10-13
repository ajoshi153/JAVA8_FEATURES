package com.java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<User> authentication = u -> u.getName().equals("Atharva") && u.getPassword().equals("123");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String n = scanner.next();
		System.out.println("Enter Password: ");
		String p = scanner.next();

		User user = new User(n, p);
		if (authentication.test(user)) {
			System.out.println("Succefully Authenticated.");
		} else {
			System.out.println("Authentication failed.");
		}
	}
}
