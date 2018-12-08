package net.hogerheijde;

import java.io.InputStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

class Application1 {
		public static void main(String[] args) {
		System.out.println("Module 1");
		variant1();
		// variant2();
	}

	// ---------------------------------------------------

	public static void variant1() {
		InputStream inputStream = Application.class.getResourceAsStream("/header.txt");
		String headerText = inputStreamToStringWithLoadsOfAssumptions(inputStream);
		System.out.println(headerText);
	}

	public static String inputStreamToStringWithLoadsOfAssumptions(InputStream in) {
		return new BufferedReader(new InputStreamReader(in)).lines().collect(Collectors.joining("\n"));
	}

	// ---------------------------------------------------

	// public static void variant2() {
	// 	InputStream inputStream = Application.class.getResourceAsStream("/header.txt");
	// 	String headerText = Util.inputStreamToStringWithLoadsOfAssumptions(inputStream);
	// 	System.out.println(headerText);
	// }
}
