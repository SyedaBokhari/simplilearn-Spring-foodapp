package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the dish database table.
 * 
 */
@Embeddable
public class DishPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dish_id")
	private int dishId;

	@Column(name="restaurant_id")
	private int restaurantId;

	private int RESTAURANT_restaurant_id;

	private int RESTAURANT_city_id;

	@Column(name="order_detail_id")
	private int orderDetailId;

	@Column(name="order_detail_order_id")
	private int orderDetailOrderId;

	@Column(name="order_detail_dish_id")
	private int orderDetailDishId;

	public DishPK() {
	}
	public int getDishId() {
		return this.dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public int getRestaurantId() {
		return this.restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getRESTAURANT_restaurant_id() {
		return this.RESTAURANT_restaurant_id;
	}
	public void setRESTAURANT_restaurant_id(int RESTAURANT_restaurant_id) {
		this.RESTAURANT_restaurant_id = RESTAURANT_restaurant_id;
	}
	public int getRESTAURANT_city_id() {
		return this.RESTAURANT_city_id;
	}
	public void setRESTAURANT_city_id(int RESTAURANT_city_id) {
		this.RESTAURANT_city_id = RESTAURANT_city_id;
	}
	public int getOrderDetailId() {
		return this.orderDetailId;
	}
	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public int getOrderDetailOrderId() {
		return this.orderDetailOrderId;
	}
	public void setOrderDetailOrderId(int orderDetailOrderId) {
		this.orderDetailOrderId = orderDetailOrderId;
	}
	public int getOrderDetailDishId() {
		return this.orderDetailDishId;
	}
	public void setOrderDetailDishId(int orderDetailDishId) {
		this.orderDetailDishId = orderDetailDishId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DishPK)) {
			return false;
		}
		DishPK castOther = (DishPK)other;
		return 
			(this.dishId == castOther.dishId)
			&& (this.restaurantId == castOther.restaurantId)
			&& (this.RESTAURANT_restaurant_id == castOther.RESTAURANT_restaurant_id)
			&& (this.RESTAURANT_city_id == castOther.RESTAURANT_city_id)
			&& (this.orderDetailId == castOther.orderDetailId)
			&& (this.orderDetailOrderId == castOther.orderDetailOrderId)
			&& (this.orderDetailDishId == castOther.orderDetailDishId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dishId;
		hash = hash * prime + this.restaurantId;
		hash = hash * prime + this.RESTAURANT_restaurant_id;
		hash = hash * prime + this.RESTAURANT_city_id;
		hash = hash * prime + this.orderDetailId;
		hash = hash * prime + this.orderDetailOrderId;
		hash = hash * prime + this.orderDetailDishId;
		
		return hash;
	}
}