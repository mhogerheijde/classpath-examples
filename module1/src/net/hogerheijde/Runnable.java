package net.hogerheijde;

import java.io.InputStream;

class Runnable {
	public static void main(String[] args) {
		System.out.println("Module 1");

		InputStream inputStream = Runnable.class.getResourceAsStream("/header.txt");
		String headerText = Util.inputStreamToStringWithLoadsOfAssumptions(inputStream);
		System.out.println(headerText);
	}
}
