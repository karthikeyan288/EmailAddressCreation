package com.EmailAddress;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPattern {
	private String emailAddressUc1;
	private String emailAddressUc2;
	private String emailAddressUc3;
	private String emailAddressUc4;
	private String emailAddressUc5;

	Scanner sc = new Scanner(System.in);

	public void getemailAddressUc1() {
		System.out.println("Enter the emailaddtress for condition :1");
		emailAddressUc1 = sc.nextLine();
		boolean b3 = Pattern.matches("^[a-z]+[a-b]*$", emailAddressUc1);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-1");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-1");
			getemailAddressUc1();
		}
	}

	public void getemailAddressUc2() {
		System.out.println("Enter the emailaddtress for condition :2");
		emailAddressUc2 = sc.nextLine();
		boolean b3 = Pattern.matches("^[a-z]+[a-b]*@[a-z]+$", emailAddressUc2);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-2");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-2");
			getemailAddressUc2();
		}
	}

	public void getemailAddressUc3() {
		System.out.println("Enter the emailaddtress for condition :3");
		emailAddressUc3 = sc.nextLine();
		boolean b3 = Pattern.matches("^[a-z.]+[a-b]*@[a-z]+.([a-z]{2})+$", emailAddressUc3);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-3");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-3");
			getemailAddressUc3();
		}
	}

	public void getemailAddressUc4() {
		System.out.println("Enter the emailaddtress for condition :4");
		emailAddressUc4 = sc.nextLine();
		boolean b3 = Pattern.matches("^[a-z.]+[a-b]*@[a-z]+.([a-z]{2,})+[.-_+a-z]*$", emailAddressUc4);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-4");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-4");
			getemailAddressUc4();
		}
	}

	public void getemailAddressUc5() {
		System.out.println("Enter the emailaddtress for condition :5");
		emailAddressUc5 = sc.nextLine();
		boolean b3 = Pattern.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]+.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$",
				emailAddressUc5);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-5");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-5");
			getemailAddressUc5();
		}
	}

	public String getEmailAddressUc1() {
		return emailAddressUc1;
	}

	public void setEmailAddressUc1(String emailAddressUc1) {
		this.emailAddressUc1 = emailAddressUc1;
	}

	public String getEmailAddressUc2() {
		return emailAddressUc2;
	}

	public void setEmailAddressUc2(String emailAddressUc2) {
		this.emailAddressUc2 = emailAddressUc2;
	}

	public String getEmailAddressUc3() {
		return emailAddressUc3;
	}

	public void setEmailAddressUc3(String emailAddressUc3) {
		this.emailAddressUc3 = emailAddressUc3;
	}

	public String getEmailAddressUc4() {
		return emailAddressUc4;
	}

	public void setEmailAddressUc4(String emailAddressUc4) {
		this.emailAddressUc4 = emailAddressUc4;
	}

	public String getEmailAddressUc5() {
		return emailAddressUc5;
	}

	public void setEmailAddressUc5(String emailAddressUc5) {
		this.emailAddressUc5 = emailAddressUc5;
	}
}