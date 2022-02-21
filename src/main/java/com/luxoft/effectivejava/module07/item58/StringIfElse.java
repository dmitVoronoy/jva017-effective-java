package com.luxoft.effectivejava.module07.item58;

public class StringIfElse {
	public static void main(String[] args) {

		int code = 0;
		String message = "OK";

		if (message.equals("OK")) {
			code = 200;
		} else if (message.equals("Not Found")) {
			code = 404;
		}
		
		System.out.println("Received code is: " + code);
	}

}
