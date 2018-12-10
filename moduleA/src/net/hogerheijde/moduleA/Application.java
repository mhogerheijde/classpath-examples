package net.hogerheijde.moduleA;

import java.io.InputStream;
import net.hogerheijde.Util;


class Application {

	public static void main(String[] args) {
		System.out.println("Module A");

		String filename = "/net/hogerheijde/moduleA/header.txt";
		System.out.println(String.format("Reading file from %s", Application.class.getResource(filename)));

		InputStream inputStream = Application.class.getResourceAsStream(filename);
		String headerText = Util.inputStreamToStringWithLoadsOfAssumptions(inputStream);

		System.out.println(headerText);
	}
}
