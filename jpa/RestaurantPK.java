package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the restaurant database table.
 * 
 */
@Embeddable
public class RestaurantPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="restaurant_id")
	private int restaurantId;

	@Column(name="city_id")
	private int cityId;

	public RestaurantPK() {
	}
	public int getRestaurantId() {
		return this.restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getCityId() {
		return this.cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RestaurantPK)) {
			return false;
		}
		RestaurantPK castOther = (RestaurantPK)other;
		return 
			(this.restaurantId == castOther.restaurantId)
			&& (this.cityId == castOther.cityId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.restaurantId;
		hash = hash * prime + this.cityId;
		
		return hash;
	}
}