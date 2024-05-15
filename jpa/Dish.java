package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the dish database table.
 * 
 */
@Entity
@NamedQuery(name="Dish.findAll", query="SELECT d FROM Dish d")
public class Dish implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DishPK id;

	private String ingredients;

	private String name;

	private int price;

	public Dish() {
	}

	public DishPK getId() {
		return this.id;
	}

	public void setId(DishPK id) {
		this.id = id;
	}

	public String getIngredients() {
		return this.ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}