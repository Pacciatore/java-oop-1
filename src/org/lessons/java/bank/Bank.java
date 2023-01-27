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

		accountInfo(bankAccount);

		menu(s, bankAccount);

		s.close();

	}

	public static void accountInfo(Conto bankAccount) {
		System.out.println("Riepilogo conto");
		System.out.println();
		System.out.println("Nome: " + bankAccount.accountName);
		System.out.println("Numero conto: " + bankAccount.getAccountNumber());
		System.out.println("Saldo: " + bankAccount.formattedBalance() + "€");
		System.out.println();
	}

	public static void menu(Scanner s, Conto bankAccount) {

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
				deposit(s, bankAccount);
				break;

			case 2:
				withdraw(s, bankAccount);
				;
				break;

			case 3:
				System.out.println("Chiusura del programma...");
				break;

			default:
				System.out.println("Inserire un numero compreso tra 1 e 3.");
				break;
			}

		} while (choice != 3);

	}

	public static void deposit(Scanner s, Conto account) {
		float depositAmount = 0f;

		System.out.println("------------------------------------");
		System.out.print("Inserire l'importo da versare: ");
		depositAmount = s.nextFloat();
		s.hasNextLine();

		System.out.println("Deposito di " + depositAmount + "€");

		account.deposit(depositAmount);

	}

	public static void withdraw(Scanner s, Conto account) {
		float withdrawAmount = 0f;

		System.out.println("-------------------------------------");
		System.out.print("Inserire l'importo da prelevare: ");
		withdrawAmount = s.nextFloat();
		s.nextLine();

		if (account.withdraw(withdrawAmount)) {
			System.out.println("Prelievo effetuato correttamente.");
			System.out.println("Nuovo saldo: " + account.formattedBalance() + "€");
		} else {
			System.out.println("Impossibile effettuare il prelievo.");
		}
	}

}
