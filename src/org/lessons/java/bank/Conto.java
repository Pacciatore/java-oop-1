package org.lessons.java.bank;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Conto {

	private int accountNumber;
	String accountName;
	float balance;

	public Conto(int _accountNumber, String _accountName, float _balance) {
		this.accountNumber = _accountNumber;
		this.accountName = _accountName;
		this.balance = _balance;
	}

	public Conto(int _accountNumber, String _accountName) {
		this.accountNumber = _accountNumber;
		this.accountName = _accountName;
		this.balance = 0f;
	}

	public String formattedBalance() {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_EVEN);

		return df.format(this.balance);

	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void deposit(float money) {
		this.balance += money;
	}

	public boolean withdraw(float money) {
		if (money <= this.balance) {
			this.balance -= money;
			return true;
		}
		return false;
	}

}
