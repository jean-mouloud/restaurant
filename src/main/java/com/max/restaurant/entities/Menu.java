package com.max.restaurant.entities;

public class Menu {


	private Plat plat;
	private Entree entree;
	private Dessert dessert;

	public Menu() {

	}

	public Menu(Plat plat, Entree entree, Dessert dessert) {
		super();
		this.plat = plat;
		this.entree = entree;
		this.dessert = dessert;
	}

	public Plat getPlat() {
		return plat;
	}
	public void setPlat(Plat plat) {
		this.plat = plat;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
}
