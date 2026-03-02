package com.user.welcome.dashboard;

import java.util.Scanner;

public class WelcomeUI {

	public void UI() {

		System.out.println(
				"\n\nYOU ARE LOGIN \n\nWelcome to BMS APPLICATION\n\n1.Create Account \n2.Deposit\n3.Withdraw\n4.Check Balance\n5.Check Loan Availability\n6.Know your CIBIL Score\n7.logout");
		Scanner s1 = new Scanner(System.in);
		System.out.println("\nEnter your choice :");
		int a = s1.nextInt();
		s1.close();
		
	}

}
