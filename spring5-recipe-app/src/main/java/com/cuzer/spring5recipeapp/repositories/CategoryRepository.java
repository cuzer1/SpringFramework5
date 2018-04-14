package com.cuzer.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuzer.spring5recipeapp.domains.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
