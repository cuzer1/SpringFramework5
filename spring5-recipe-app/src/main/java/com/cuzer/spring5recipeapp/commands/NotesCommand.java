package com.cuzer.spring5recipeapp.commands;

import javax.persistence.Lob;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {
	private Long id;
	private String description;
	@Lob
	private String recipeNotes;

}
