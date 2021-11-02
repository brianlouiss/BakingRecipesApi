package com.shake.bake.bakeshake;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Recipe {
	
	private @Id @GeneratedValue Long id; 
	private String recipeName;
	private String recipeAuthor; 
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	Recipe() {}
	
	Recipe(String recipeName, String recipeAuthor, ArrayList<Ingredient> ingredients) {
		this.recipeName = recipeName;
		this.recipeAuthor = recipeAuthor;
		this.ingredients = ingredients;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getRecipeName() {
		return this.recipeName;
	}
	
	public String getRecipeAuthor() {
		return this.recipeAuthor;
	}
	
	public ArrayList<Ingredient> getIngredients() {
		return this.ingredients;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	
	public void setRecipeAuthor(String recipeAuthor) {
		this.recipeAuthor = recipeAuthor;
	}
	
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
}
