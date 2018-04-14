package com.cuzer.spring5recipeapp.services;

import java.util.Set;

import com.cuzer.spring5recipeapp.domains.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();

}
