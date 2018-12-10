package net.hogerheijde.module1;

import java.io.InputStream;

import net.hogerheijde.Util;

class Runnable {
	public static void main(String[] args) {
		System.out.println("Module 1");

		InputStream inputStream = Runnable.class.getResourceAsStream("header.txt");
		String headerText = Util.inputStreamToStringWithLoadsOfAssumptions(inputStream);
		System.out.println(headerText);
	}
}
