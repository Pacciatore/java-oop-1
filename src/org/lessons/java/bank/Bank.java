package org.lessons.java.bank;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Bank {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_EVEN);

		Conto francoBank = new Conto(12, "Franco Rossi");

		System.out.println("Informazione del conto di: " + francoBank.accountName);
		System.out.println();
		System.out.println("Codice c/c: " + francoBank.accountNumber);
		System.out.println("Saldo: " + df.format(francoBank.balance) + "€");

		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();

		Conto paoloBank = new Conto(55, "Paolo Bianchi", 1523.1f);

		System.out.println("Informazione del conto di: " + paoloBank.accountName);
		System.out.println();
		System.out.println("Codice c/c: " + paoloBank.accountNumber);
		System.out.println("Saldo: " + df.format(paoloBank.balance) + "€");

	}

}
