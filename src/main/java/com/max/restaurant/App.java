package com.max.restaurant;

import com.max.restaurant.entities.Dessert;
import com.max.restaurant.entities.Entree;
import com.max.restaurant.entities.Ingredient;
import com.max.restaurant.entities.Menu;
import com.max.restaurant.entities.Plat;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		Ingredient salade = new Ingredient("salade", "legume", 100);
		Ingredient coquillette = new Ingredient("coquilette", "pâtes", 60);
		Ingredient soupePoisson = new Ingredient("Soupe", "bouillon", 90);
		Ingredient maroilles = new Ingredient("Maroilles", "fromage", 20);
		Ingredient poulet = new Ingredient("Poulet", "volaille", 70);

		Plat patePoulet = new Plat();
		patePoulet.addIngredient(poulet);

		Entree saladeVerte = new Entree();
		saladeVerte.addIngredient(salade);
		System.out.println(patePoulet.getIngredients().size());

		Dessert plateauFromage = new Dessert();
		plateauFromage.addIngredient(maroilles);

		Menu formuleMidi = new Menu(patePoulet,saladeVerte,plateauFromage);
		formuleMidi.listeIngredient(saladeVerte);
		formuleMidi.listeIngredient(plateauFromage);
		//for(Ingredient ingredient : formuleMidi.)
	}
}
