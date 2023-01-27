package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Benvenuto nella creazione del tuo conto bancario!");
		System.out.print("Inserire nome: ");
		String inputName = s.nextLine();

		Conto bankAccount = new Conto(inputName);

		System.out.println("---------------------------------------");
		System.out.println("Riepilogo conto");
		System.out.println();
		System.out.println("Nome: " + bankAccount.accountName);
		System.out.println("Numero conto: " + bankAccount.getAccountNumber());
		System.out.println("Saldo: " + bankAccount.formattedBalance() + "€");

		int choice = 100;

		s.close();

	}

}
