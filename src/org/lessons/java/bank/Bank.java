package org.lessons.java.bank;

public class Bank {

	public static void main(String[] args) {

		Conto francoBank = new Conto(12, "Franco Rossi");

		System.out.println("Informazioni del conto di: " + francoBank.accountName);
		System.out.println();
		System.out.println("Codice c/c: " + francoBank.getAccountNumber());
		System.out.println("Saldo: " + francoBank.formattedBalance() + "€");

		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();

		francoBank.deposit(2000f);
		System.out.println("Saldo dopo il deposito: " + francoBank.formattedBalance());

		System.out.println();

		boolean firstDone = francoBank.withdraw(15f);
		if (firstDone)
			System.out.println("Prelievo eseguito correttamente!");
		else
			System.out.println("Impossibile effettuare il prelievo.");

		boolean done = francoBank.withdraw(2000f);
		if (done)
			System.out.println("Prelievo eseguito correttamente!");
		else
			System.out.println("Impossibile effettuare il prelievo.");

	}

}
