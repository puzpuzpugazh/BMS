package com.user.login;

import java.util.Scanner;

public class LandingPage {

	static String baseDBUrl = "C:\\Users\\ADMIN\\eclipse-workspace\\Bankimport\\src\\assets";

	public static void main(String[] args) {
		// TODO based on user choice re-direct to login / New user register -> Account
		// creation
		
		ExistingUserLogin e = new ExistingUserLogin();
//		LandingPage lp = new LandingPage();
		Scanner sc = new Scanner(System.in);
		boolean b=true;
	    while(b) {
	    	System.out.println("                      ||    WELCOME TO  BMS :-)    ||");
			System.out.print("1. Existing Customer? \n2. New Customer? \n   Choose your option : ");
//			Scanner sc1=new Scanner(System.in);
	    	int a=sc.nextInt();
			
		    if(a==1) {
				System.out.println("Redireting to login page...");
				e.loginAccTypeSel(sc, baseDBUrl);
			}
			else if(a==2) {
				System.out.println("Redireting to the signup page...");
			}
			else {
				System.out.println("Sorry bro option unavailable, Choose one between 1 or 2");
				b=true;
			}	
		    
	    }
	    sc.close();
	}   

}
