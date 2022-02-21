package com.luxoft.effectivejava.module03.item20.hierarchy;


public abstract class Account {
	double balance;
        
    abstract double maximumAmountToWithdraw();
    
    public Account(double balance){
        this.balance = balance;
    }
}