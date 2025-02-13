package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Payment {

	@Value(value = "100")
	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public double deposit(int amount) {
		balance = balance - amount;
		return balance;
	}

	public double makePayment(double totalAmount) {
		balance = balance-totalAmount;
		return balance;
	}
	
	
}
