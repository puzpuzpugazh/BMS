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
			System.out.println(e);
		}
		this.name = name;
		this.pass = pass;
		if (sc.hasNext()) {
			this.userDet = sc.next();
			if (userDet.split("-")[0].equals(name) && userDet.split("-")[1].equals(pass)) {
				sc.close();
				return true;
			}
		}
		return false;
	}
}
