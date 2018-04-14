package com.cuzer.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuzer.spring5recipeapp.domains.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
