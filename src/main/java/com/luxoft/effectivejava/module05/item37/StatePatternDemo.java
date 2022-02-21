package com.luxoft.effectivejava.module05.item37;

public class StatePatternDemo {
	public static void main(String[] args) { 
		CreditRequest creditRequest = new CreditRequest(1000.00, 5000.00); 
		
		creditRequest.doAction();
		creditRequest.doAction();
	}
}
