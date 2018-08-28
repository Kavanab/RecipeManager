package com.monsanto.mbt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private String description;
	@Column @NonNull
	private String ingredient1;
	@Column @NonNull
	private String ingredient2;
	@Column @NonNull
	private String ingredient3;
	@Column @NonNull
	private String ingredient4;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIngredient1() {
		return ingredient1;
	}
	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}
	public String getIngredient2() {
		return ingredient2;
	}
	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
	}
	public String getIngredient3() {
		return ingredient3;
	}
	public void setIngredient3(String ingredient3) {
		this.ingredient3 = ingredient3;
	}
	public String getIngredient4() {
		return ingredient4;
	}
	public void setIngredient4(String ingredient4) {
		this.ingredient4 = ingredient4;
	}

}
