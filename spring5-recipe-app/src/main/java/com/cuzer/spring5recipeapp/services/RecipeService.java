package com.cuzer.spring5recipeapp.services;

import java.util.Set;

import com.cuzer.spring5recipeapp.commands.RecipeCommand;
import com.cuzer.spring5recipeapp.domains.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();

	Recipe findById(Long l);

	RecipeCommand findCommandById(Long l);

	RecipeCommand saveRecipeCommand(RecipeCommand command);

	void deleteById(Long idToDelete);
}