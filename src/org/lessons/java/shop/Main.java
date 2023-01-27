package org.lessons.java.shop;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.CEILING);

		Prodotto mela = new Prodotto("Mela", "Una bellissima mela rossa.", 1f, 4);

		System.out.println("Ecco il tuo prodotto: " + mela.getLongName());
		System.out.println("Descrizione: " + mela.description);
		System.out.println("Prezzo: " + df.format(mela.getBasePrice()) + "€");

		System.out.println("IVA: " + mela.vat + "%");
		System.out.println("Prezzo comprensivo di IVA: " + df.format(mela.getVatPrice()) + "€");

	}

}
