package com.EmailAddress;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPattern {
	private String emailAddressUc1;
	private String emailAddressUc2;

	Scanner sc = new Scanner(System.in);

	public void getemailAddressUc1() {
		System.out.println("Enter the emailaddtress for condition :1");
		emailAddressUc1 = sc.nextLine();
		boolean b3 = Pattern.matches("^[a-z]+[a-b]*$", emailAddressUc1);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-1");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-1");
		}
	}

	public String getEmailAddressUc1() {
		return emailAddressUc1;
	}

	public void setEmailAddressUc1(String emailAddressUc1) {
		this.emailAddressUc1 = emailAddressUc1;
	}
}
