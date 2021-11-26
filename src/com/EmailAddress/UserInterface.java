package com.EmailAddress;

public class UserInterface {
	private String emailAddressUc1;
	private String emailAddressUc2;

	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		EmailPattern emailPattern = new EmailPattern();

		emailPattern.getemailAddressUc1();
		userInterface.emailAddressUc1 = emailPattern.getEmailAddressUc1();
		emailPattern.getemailAddressUc2();
		userInterface.emailAddressUc2 = emailPattern.getEmailAddressUc2();

		userInterface.display();
	}

	private void display() {
		System.out.println(
				"\nThe email for condition 1:" + emailAddressUc1 + "\nThe email for condition 2:" + emailAddressUc2);
	}

}
