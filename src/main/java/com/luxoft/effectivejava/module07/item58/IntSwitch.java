package com.luxoft.effectivejava.module07.item58;

public class IntSwitch {
	public static void main(String[] args) {

		int code = 200;
		String message = null;

		switch (code) {
			case 200:
				message = "OK";
				break;
			case 404:
				message = "Not Found";
				break;
			default:
				message = "Unknown";
				break;
		}
		System.out.println("Message received: " + message);
	}
}
