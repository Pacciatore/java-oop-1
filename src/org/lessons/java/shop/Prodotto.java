package org.lessons.java.shop;

public class Prodotto {

	int id;
	String name;
	String description;
	float price;
	int vat;

	public Prodotto(int _id, String _name, String _description, float _price, int _vat) {
		id = _id; // To define getRandomID()
		name = _name;
		description = _description;
		price = _price;
		vat = _vat;
	}

}
