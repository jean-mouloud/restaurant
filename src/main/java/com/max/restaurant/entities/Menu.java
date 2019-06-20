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

	/**
	 *
	 * @param etapeMenu type RecetteCuisine
	 * Methode qui vérifie le type de recetteCuisine et parcourt la liste
	 * des ingrédients correspondants de type passé en paramètre(Entree, Plat, Dessert)
	 */
	public void listeIngredient(RecetteCuisine etapeMenu) {
		if(etapeMenu instanceof Entree) {
			for(Ingredient ingredient : this.entree.getIngredients()) {
				System.out.println(ingredient.getNom());
			}
		}else if( etapeMenu instanceof Plat) {
			for (Ingredient ingredient: this.plat.getIngredients()) {
				System.out.println(ingredient.getNom());
			}
		}else if (etapeMenu instanceof Dessert){
			for(Ingredient ingredient : this.plat.getIngredients()) {
				System.out.println(ingredient.getNom());
			}
		}
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
