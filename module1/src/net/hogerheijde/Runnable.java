package net.hogerheijde;

import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

class Runnable {
	public static void main(String[] args) {
		System.out.println("Module 1");

		InputStream inputStream = Runnable.class.getResourceAsStream("/header.txt");
		String headerText = inputStreamToStringWithLoadsOfAssumptions(inputStream);
		System.out.println(headerText);
	}

	public static String inputStreamToStringWithLoadsOfAssumptions(InputStream in) {
		return new BufferedReader(new InputStreamReader(in)).lines().collect(Collectors.joining("\n"));
	}
}
