package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	int id;
	String name;
	String description;
	float price;
	int vat;

	public Prodotto(String _name, String _description, float _price, int _vat) {
		this.id = getRandomID();
		this.name = _name;
		this.description = _description;
		this.price = _price;
		this.vat = _vat;
	}

	private int getRandomID() {

		Random r = new Random();

		int randomID = r.nextInt(10000000);

		return randomID;
	}

	public float getBasePrice() {
		return this.price;
	}

	public float getVatPrice() {

		float vatPercentage = (float) vat / 100;
		float vatCost = this.price * vatPercentage;

		float vatPrice = this.price + vatCost;

		return vatPrice;
	}

	public String getLongName() {

		StringBuilder longName = new StringBuilder(this.id + "-" + this.name.toLowerCase());

		return longName.toString();
	}

	public String getPaddedID() {

		String paddedID = String.format("%08d", this.id);

		return paddedID;
	}

}
