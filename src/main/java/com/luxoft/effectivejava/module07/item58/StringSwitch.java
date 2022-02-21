package com.luxoft.effectivejava.module07.item58;

public class StringSwitch {
	public static void main(String[] args) {

		int code = 0;
		String message = "OK";

		switch (message) {
			case "OK":
			  code = 200;
			break;
			case "Not Found":
			  code = 404;
			break;
		}
		System.out.println("Received code is: " + code);
	}
}
