package com.luxoft.effectivejava.module05.item37;

//Emulated extensible enum using an interface
public interface State {
	void doAction(CreditRequest creditRequest);
}
