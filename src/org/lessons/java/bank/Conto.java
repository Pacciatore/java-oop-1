package org.lessons.java.bank;

public class Conto {

	int accountNumber;
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

}
