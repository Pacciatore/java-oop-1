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

	int getRandomID() {

		Random r = new Random();

		int randomID = r.nextInt(100);

		return randomID;
	}

}
