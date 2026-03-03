package com.user.login;

import java.util.Scanner;

public class LandingPage {

	static String baseDBUrl = "src/assets";

	public static void main(String[] args) {
		ExistingUserLogin e = new ExistingUserLogin();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		LandingPage c = new LandingPage();
		c.landingLogic(b, sc, e);
		sc.close();
	}

	public void landingLogic(boolean b, Scanner sc, ExistingUserLogin e) {

		while (b) {
			System.out.println("                    ||    WELCOME TO  BMS :-)    ||");
			System.out.print("1. Existing Customer? \n2. New Customer? \n   Choose your option : ");

			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("Redirecting to login page...");
				// change b to false
				e.loginAccTypeSel(sc, baseDBUrl);
			} else if (a == 2) {
				System.out.println("Redirecting to the signup page...");
				// change b to false and redirect to other page
			} else {
				System.out.println("Sorry bro option unavailable, Choose one between 1 or 2");
			}
		}
	}
}