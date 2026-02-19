package com.user.login;

import java.io.File;
import java.util.Scanner;

public class ExistingUserLogin {
	int accType = 0;
	File f;
	String userName;
	String pass;
	String currentAccUrl = "/currentDB.txt";
	String savingsAccUrl = "/savingsDB.txt";
	boolean isValid = false;
	int failCount = 0;

	boolean loginSavingsAcc(LoginValidation lv, File f, Scanner sc, String baseDBUrl) {
		System.out.println(":: Savings Account login ::");
		while (isValid == false && failCount < 3) {
			System.out.print("Enter Username: ");
			userName = sc.next();
			System.out.print("Enter Password: ");
			pass = sc.next();
			f = new File(baseDBUrl + savingsAccUrl);
			isValid = lv.loginAccValidation(f, userName, pass);
			failCount++;
		}
		return true;

	}

	boolean loginCurrentAcc(LoginValidation lv, File f, Scanner sc, String baseDBUrl) {
		System.out.println(":: Current Account login:: ");
		while (isValid == false && failCount < 3) {
			System.out.print("Enter Username: ");
			userName = sc.next();
			System.out.print("Enter Password: ");
			pass = sc.next();
			f = new File(baseDBUrl + currentAccUrl);
			isValid = lv.loginAccValidation(f, userName, pass);
			failCount++;
		}
		return true;

	}

	void loginAccTypeSel(Scanner sc, String baseDBUrl) {
		ExistingUserLogin eul = new ExistingUserLogin();
		LoginValidation lv = new LoginValidation();
		boolean isLogged = false;
		System.out.println("Enter Account Type: \n1. Savings \n2. Current");
		accType = sc.nextInt();
		if (accType == 1) {
//			Savings
			if (loginSavingsAcc(lv, f, sc, baseDBUrl) && failCount< 3) {
				System.out.println("Login Successful on your Savings account");
			} else {
				System.out.println("Login failed");
			}
		} else if (accType == 2) {
//			Current
			if (loginCurrentAcc(lv, f, sc, baseDBUrl) && failCount<3) {
				System.out.println("Login Successful on your Current account");
			} else {
				System.out.println("Login failed");
			}
		}
	}
}
