package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	int id;
	String name;
	String description;
	float price;
	int vat;

	public Prodotto(String _name, String _description, float _price, int _vat) {
		id = getRandomID();
		name = _name;
		description = _description;
		price = _price;
		vat = _vat;
	}

	private int getRandomID() {

		Random r = new Random();

		int randomID = r.nextInt(100);

		return randomID;
	}

	public float getBasePrice() {
		return price;
	}

	public float getVatPrice() {

		float vatPercentage = (float) vat / 100;
		float vatCost = price * vatPercentage;

		float vatPrice = price + vatCost;

		return vatPrice; // To round 2 decimals
	}

	public String getLongName() {

		StringBuilder longName = new StringBuilder(id + "-" + name.toLowerCase());

		return longName.toString();
	}

}
