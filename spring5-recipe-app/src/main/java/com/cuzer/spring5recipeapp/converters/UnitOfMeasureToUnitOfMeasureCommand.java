package com.cuzer.spring5recipeapp.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.cuzer.spring5recipeapp.commands.UnitOfMeasureCommand;
import com.cuzer.spring5recipeapp.domains.UnitOfMeasure;

import lombok.Synchronized;

@Component
public class UnitOfMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {

	@Synchronized
	@Nullable
	@Override
	public UnitOfMeasureCommand convert(UnitOfMeasure unitOfMeasure) {

		if (unitOfMeasure != null) {
			final UnitOfMeasureCommand uomc = new UnitOfMeasureCommand();
			uomc.setId(unitOfMeasure.getId());
			uomc.setDescription(unitOfMeasure.getDescription());
			return uomc;
		}
		return null;
	}
}