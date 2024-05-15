package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the cart database table.
 * 
 */
@Embeddable
public class CartPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="user_id")
	private int userId;

	private int USER_user_id;

	public CartPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUSER_user_id() {
		return this.USER_user_id;
	}
	public void setUSER_user_id(int USER_user_id) {
		this.USER_user_id = USER_user_id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CartPK)) {
			return false;
		}
		CartPK castOther = (CartPK)other;
		return 
			(this.id == castOther.id)
			&& (this.userId == castOther.userId)
			&& (this.USER_user_id == castOther.USER_user_id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.USER_user_id;
		
		return hash;
	}
}