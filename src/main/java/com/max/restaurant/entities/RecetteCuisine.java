package com.max.restaurant.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class RecetteCuisine {

	private List<Ingredient> ingredients;

	public RecetteCuisine() {
		this.ingredients = new ArrayList<Ingredient>();
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "RecetteCuisine [ingredients=" + ingredients + "]";
	}
}
