package com.user.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginValidation {
	String name, pass;
	String userDet;
	Scanner sc;

	boolean loginAccValidation(File f, String name, String pass) {
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println(e+ "\n503 Service Unavailable. Requested DB Can't be found in server. Error from our end \nWe'll fix the issue from our side application will be rebooted tomorrow 6.00AM\n Maintainance time (~6.00AM)");
			System.exit(0);
		}
		this.name = name;
		this.pass = pass;
		try {
			if (sc.hasNext()) {
				this.userDet = sc.next();
				if (userDet.split("-")[0].equals(name) && userDet.split("-")[1].equals(pass)) {
					sc.close();
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println(e+"\nData can't be found in our DB. \nRecommended: Kindly check for valid credentails");
			return false;
		}
		return false;
	}
}
