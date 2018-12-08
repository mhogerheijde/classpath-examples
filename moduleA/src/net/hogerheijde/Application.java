package net.hogerheijde;

import java.io.InputStream;

class Application {

	public static void main(String[] args) {
		System.out.println("Module A");

		InputStream inputStream = Application.class.getResourceAsStream("/header.txt");
		String headerText = Util.inputStreamToStringWithLoadsOfAssumptions(inputStream);

		System.out.println(headerText);
	}
}
