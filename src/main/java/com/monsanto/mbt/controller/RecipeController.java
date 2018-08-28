
package com.monsanto.mbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monsanto.mbt.model.Recipe;
import com.monsanto.mbt.repository.RecipeRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/recipe")
public class RecipeController<ItemRepository> {
	
	 @Autowired
	  private RecipeRepository repository;
	 
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	public Iterable<Recipe> getRecipes() {
		return repository.findAll();
		
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public ResponseEntity<Object> addRecipe(@RequestBody Recipe recipe) {
		if(recipe != null && recipe.getName()!= null) 
			return ResponseEntity.ok(repository.save(recipe));
		else
			return ResponseEntity.badRequest().build();
		
	}
}
