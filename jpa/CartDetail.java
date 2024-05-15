package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the cart_details database table.
 * 
 */
@Entity
@Table(name="cart_details")
@NamedQuery(name="CartDetail.findAll", query="SELECT c FROM CartDetail c")
public class CartDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CartDetailPK id;

	private int DISH_dish_id;

	private int DISH_order_detail_dish_id;

	private int DISH_order_detail_id;

	private int DISH_order_detail_order_id;

	private int DISH_RESTAURANT_city_id;

	private int DISH_restaurant_id;

	private int DISH_RESTAURANT_restaurant_id;

	public CartDetail() {
	}

	public CartDetailPK getId() {
		return this.id;
	}

	public void setId(CartDetailPK id) {
		this.id = id;
	}

	public int getDISH_dish_id() {
		return this.DISH_dish_id;
	}

	public void setDISH_dish_id(int DISH_dish_id) {
		this.DISH_dish_id = DISH_dish_id;
	}

	public int getDISH_order_detail_dish_id() {
		return this.DISH_order_detail_dish_id;
	}

	public void setDISH_order_detail_dish_id(int DISH_order_detail_dish_id) {
		this.DISH_order_detail_dish_id = DISH_order_detail_dish_id;
	}

	public int getDISH_order_detail_id() {
		return this.DISH_order_detail_id;
	}

	public void setDISH_order_detail_id(int DISH_order_detail_id) {
		this.DISH_order_detail_id = DISH_order_detail_id;
	}

	public int getDISH_order_detail_order_id() {
		return this.DISH_order_detail_order_id;
	}

	public void setDISH_order_detail_order_id(int DISH_order_detail_order_id) {
		this.DISH_order_detail_order_id = DISH_order_detail_order_id;
	}

	public int getDISH_RESTAURANT_city_id() {
		return this.DISH_RESTAURANT_city_id;
	}

	public void setDISH_RESTAURANT_city_id(int DISH_RESTAURANT_city_id) {
		this.DISH_RESTAURANT_city_id = DISH_RESTAURANT_city_id;
	}

	public int getDISH_restaurant_id() {
		return this.DISH_restaurant_id;
	}

	public void setDISH_restaurant_id(int DISH_restaurant_id) {
		this.DISH_restaurant_id = DISH_restaurant_id;
	}

	public int getDISH_RESTAURANT_restaurant_id() {
		return this.DISH_RESTAURANT_restaurant_id;
	}

	public void setDISH_RESTAURANT_restaurant_id(int DISH_RESTAURANT_restaurant_id) {
		this.DISH_RESTAURANT_restaurant_id = DISH_RESTAURANT_restaurant_id;
	}

}