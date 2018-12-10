package net.hogerheijde.moduleA;

import java.io.InputStream;
import net.hogerheijde.Util;


class Application {

	public static void main(String[] args) {
		System.out.println("Module A");

		InputStream inputStream = Application.class.getResourceAsStream("/net/hogerheijde/moduleA/header.txt");
		String headerText = Util.inputStreamToStringWithLoadsOfAssumptions(inputStream);

		System.out.println(headerText);
	}
}
