package com.user.login;

import java.io.File;
import java.util.Scanner;

import com.user.welcome.dashboard.WelcomeUI;



public class ExistingUserLogin {
	int accType = 0;
	File f;
	String userName;
	String pass;
	String currentAccUrl = "/currentDB.txt";
	String savingsAccUrl = "/savingsDB.txt";
	boolean isValid = false;
	boolean isValidAccTypeSelection = false;
	int failCount = 0;

	boolean loginSavingsAcc(LoginValidation lv, File f, Scanner sc, String baseDBUrl) {
		System.out.println("\n:: Savings Account login ::");
		while (isValid == false && failCount < 3) {
			System.out.println("\nEnter your credentails here., ");
			System.out.print("Enter Username: ");
			userName = sc.next();
			System.out.print("Enter Password: ");
			pass = sc.next();
			try {
				f = new File(baseDBUrl + savingsAccUrl);
			} catch (Exception e) {
				System.out.println(e);
				return false;
			}
			isValid = lv.loginAccValidation(f, userName, pass);
			if (isValid == false) {
				failCount++;
			}
		}
		return true;
	}

	boolean loginCurrentAcc(LoginValidation lv, File f, Scanner sc, String baseDBUrl) {
		System.out.println("\n:: Current Account login:: ");
		while (isValid == false && failCount < 3) {
			System.out.println("\nEnter your credentails here., ");
			System.out.print("Enter Username: ");
			userName = sc.next();
			System.out.print("Enter Password: ");
			pass = sc.next();
			try {
				f = new File(baseDBUrl + currentAccUrl);
			} catch (Exception e) {
				System.out.println(e);
				return false;
			}
			isValid = lv.loginAccValidation(f, userName, pass);
			if (isValid == false) {
				failCount++;
			}
		}
		return true;

	}

	void loginAccTypeSel(Scanner sc, String baseDBUrl) {
		ExistingUserLogin eul = new ExistingUserLogin();
		LoginValidation lv = new LoginValidation();
		WelcomeUI wel = new WelcomeUI();
		boolean isLogged = false;
		System.out.println("Enter Account Type: \n1. Savings \n2. Current");
		while (!isValidAccTypeSelection) {
			accType = sc.nextInt();
			if (accType == 1) {
//			Savings
				isValidAccTypeSelection = true;
				if (loginSavingsAcc(lv, f, sc, baseDBUrl) && failCount < 3) {
					System.out.println("Login Successful on your Savings account");
					wel.UI();
				} else {
					System.out.println("Login failed\nRecommended: Register as a new user");
					// redirect to landing page userAccebility choice(login/ sign up) method
				}
			} else if (accType == 2) {
//			Current
				isValidAccTypeSelection = true;
				if (loginCurrentAcc(lv, f, sc, baseDBUrl) && failCount < 3) {
					System.out.println("Login Successful on your Current account");
					wel.UI();
				} else {
					System.out.println("Login failed\nRecommended: Register as a new user");
					// redirect to landing page userAccebility choice(login/ sign up) method
				}
			}
			else {
				System.out.println("Invalid Choice");
				isValidAccTypeSelection = false;
			}
		}
	}
}
