package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the cart database table.
 * 
 */
@Entity
@NamedQuery(name="Cart.findAll", query="SELECT c FROM Cart c")
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CartPK id;

	public Cart() {
	}

	public CartPK getId() {
		return this.id;
	}

	public void setId(CartPK id) {
		this.id = id;
	}

}