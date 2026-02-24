package com.user.login;

import java.util.Scanner;

public class LandingPage {

	static String baseDBUrl = "D:/UNIQ/project/BMSPRJ/src/assets";

	public static void main(String[] args) {
		// TODO based on user choice re-direct to login / New user register -> Account
		// creation
		ExistingUserLogin e = new ExistingUserLogin();
//		LandingPage lp = new LandingPage();
		Scanner sc = new Scanner(System.in);
		e.loginAccTypeSel(sc, baseDBUrl);
	}

}
