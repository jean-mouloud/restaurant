package com.max.restaurant.entities;

public class Ingredient {

	/**
	 * Classe qui définit un ingrédient
	 * un ingrédient : nom, type et valeur nutritive;
	 * @author Max
	 */

	String nom;
	String type;
	int valeurNutritive;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ingredient [nom=");
		builder.append(nom);
		builder.append(", type=");
		builder.append(type);
		builder.append(", valeurNutritive=");
		builder.append(valeurNutritive);
		builder.append("]");
		return builder.toString();
	}


	/**
	 *
	 * @param nom
	 * @param type
	 * @param valeurNutritive
	 */
	public Ingredient(String nom, String type, int valeurNutritive) {
		super();
		this.nom = nom;
		this.type = type;
		this.valeurNutritive = valeurNutritive;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getValeurNutritive() {
		return valeurNutritive;
	}


	public void setValeurNutritive(int valeurNutritive) {
		this.valeurNutritive = valeurNutritive;
	}

}
