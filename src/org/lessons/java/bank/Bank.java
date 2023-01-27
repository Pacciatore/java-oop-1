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

		int choice = 0;

		do {

			System.out.println("Scegliere l'azione da compiere tra le seguenti: ");
			System.out.println("1. Versamento");
			System.out.println("2. Prelievo");
			System.out.println("3. Chiudere il programma");

			choice = s.nextInt();
			s.nextLine();

			switch (choice) {

			case 1:
				System.out.println("Versamento");
				break;

			case 2:
				System.out.println("Prelievo");
				break;

			case 3:
				System.out.println("Chiusura del programma...");
				break;

			default:
				System.out.println("Inserire il numero dell'operazione da eseguire.");
				break;
			}

		} while (choice != 3);

		s.close();

	}

}
