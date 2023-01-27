package org.lessons.java.bank;

public class Bank {

	public static void main(String[] args) {

		Conto francoBank = new Conto(12, "Franco Rossi");

		System.out.println("Informazione del conto di: " + francoBank.accountName);
		System.out.println();
		System.out.println("Codice c/c: " + francoBank.getAccountNumber());
		System.out.println("Saldo: " + francoBank.formattedBalance() + "€");

		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();

		Conto paoloBank = new Conto(55, "Paolo Bianchi", 1523.1f);

		System.out.println("Informazione del conto di: " + paoloBank.accountName);
		System.out.println();
		System.out.println("Codice c/c: " + paoloBank.getAccountNumber());
		System.out.println("Saldo: " + paoloBank.formattedBalance() + "€");

	}

}
