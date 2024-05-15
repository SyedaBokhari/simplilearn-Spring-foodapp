package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the restaurant database table.
 * 
 */
@Entity
@NamedQuery(name="Restaurant.findAll", query="SELECT r FROM Restaurant r")
public class Restaurant implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RestaurantPK id;

	private String address;

	private int CITY_city_id;

	private String name;

	private int phone;

	public Restaurant() {
	}

	public RestaurantPK getId() {
		return this.id;
	}

	public void setId(RestaurantPK id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCITY_city_id() {
		return this.CITY_city_id;
	}

	public void setCITY_city_id(int CITY_city_id) {
		this.CITY_city_id = CITY_city_id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}