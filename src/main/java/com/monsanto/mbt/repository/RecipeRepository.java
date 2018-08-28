
package com.monsanto.mbt.repository;

import org.springframework.data.repository.CrudRepository;

import com.monsanto.mbt.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
	
}
