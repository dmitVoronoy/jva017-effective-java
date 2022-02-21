package com.luxoft.effectivejava.module07.item53;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Calendar;

public class StringConcatenation {
	private static SecureRandom random = new SecureRandom();

	public static String concatenationWithString() {
		String result = "";
		for (int i = 0; i < 1000; i++)
			result += nextString();
		return result;
	}
	
	public static String concatenationWithStringBuilder() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			result.append(nextString());
		}
		return result.toString();
	}

	public static String nextString() {
		return new BigInteger(130, random).toString(32);
	}
	
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance(); 
		concatenationWithString();
		Calendar end = Calendar.getInstance(); 
		System.out.format("Strings concatenation time: %s ms%n", end.getTime().getTime() - start.getTime().getTime());
		
		start = Calendar.getInstance(); 
		concatenationWithStringBuilder();
		end = Calendar.getInstance(); 
		System.out.format("Concatenation time with StringBuilder: %s ms%n", end.getTime().getTime() - start.getTime().getTime());
	}

}
