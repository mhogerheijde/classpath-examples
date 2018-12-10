package net.hogerheijde;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.stream.Collectors;


public class Util {
	public static String inputStreamToStringWithLoadsOfAssumptions(InputStream in) {
  		return new BufferedReader(new InputStreamReader(in)).lines().collect(Collectors.joining("\n"));
	}
}
