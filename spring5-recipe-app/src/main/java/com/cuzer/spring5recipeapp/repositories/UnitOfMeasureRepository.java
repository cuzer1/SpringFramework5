package com.cuzer.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuzer.spring5recipeapp.domains.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

}
