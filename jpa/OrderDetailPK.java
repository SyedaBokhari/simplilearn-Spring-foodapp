package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the order_detail database table.
 * 
 */
@Embeddable
public class OrderDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="order_id")
	private int orderId;

	@Column(name="dish_id")
	private int dishId;

	public OrderDetailPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return this.orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getDishId() {
		return this.dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderDetailPK)) {
			return false;
		}
		OrderDetailPK castOther = (OrderDetailPK)other;
		return 
			(this.id == castOther.id)
			&& (this.orderId == castOther.orderId)
			&& (this.dishId == castOther.dishId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.orderId;
		hash = hash * prime + this.dishId;
		
		return hash;
	}
}