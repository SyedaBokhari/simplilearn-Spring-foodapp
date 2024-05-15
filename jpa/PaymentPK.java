package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the payment database table.
 * 
 */
@Embeddable
public class PaymentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="payment_id")
	private int paymentId;

	@Column(name="order_id")
	private int orderId;

	public PaymentPK() {
	}
	public int getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getOrderId() {
		return this.orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PaymentPK)) {
			return false;
		}
		PaymentPK castOther = (PaymentPK)other;
		return 
			(this.paymentId == castOther.paymentId)
			&& (this.orderId == castOther.orderId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.paymentId;
		hash = hash * prime + this.orderId;
		
		return hash;
	}
}