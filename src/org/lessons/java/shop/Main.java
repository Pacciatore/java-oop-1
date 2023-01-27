package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto mela = new Prodotto("Mela", "Una bellissima mela rossa.", .6f, 4);

		System.out.println("Ecco il tuo prodotto: " + mela.getLongName());
		System.out.println("Descrizione: " + mela.description);
		System.out.println("Prezzo: " + mela.getBasePrice() + "€");

		System.out.println("IVA: " + mela.vat + "%");
		System.out.println("Prezzo comprensivo di IVA: " + mela.getVatPrice() + "€");

	}

}
