package com.cuzer.spring5recipeapp.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cuzer.spring5recipeapp.domains.Category;
import com.cuzer.spring5recipeapp.domains.UnitOfMeasure;
import com.cuzer.spring5recipeapp.repositories.CategoryRepository;
import com.cuzer.spring5recipeapp.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitofMeasureRepository;

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitofMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitofMeasureRepository = unitofMeasureRepository;
	}

	@RequestMapping({ "/", "", "/index" })
	public String getIndexPage() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitofMeasureOptional = unitofMeasureRepository.findByDescription("Teaspoon");

		System.out.println("Cat ID is: " + categoryOptional.get().getId());
		System.out.println("UOM ID is: " + unitofMeasureOptional.get().getId());

		return "index";
	}

}
