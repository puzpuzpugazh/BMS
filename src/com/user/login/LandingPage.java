package com.user.login;

import java.util.Scanner;

public class LandingPage {


	static String baseDBUrl = "src/assets";
	public static void main(String[] args) {
		// TODO based on user choice re-direct to login / New user register -> Account
		// creation
		// this is the first interface user should face
		// handle user login/sign up choice using a method
//		LandingPage lp = new LandingPage();
		ExistingUserLogin e = new ExistingUserLogin();
		Scanner sc = new Scanner(System.in);
		e.loginAccTypeSel(sc, baseDBUrl);
	}

}
