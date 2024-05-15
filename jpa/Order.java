package com.simplilearn.estore.jpa;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderPK id;

	@Column(name="order_detail_dish_id")
	private int orderDetailDishId;

	@Column(name="order_detail_id")
	private int orderDetailId;

	@Column(name="order_detail_order_id")
	private int orderDetailOrderId;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="payment_method")
	private String paymentMethod;

	private int PAYMENT_order_id;

	private int PAYMENT_payment_id;

	@Column(name="payment_status")
	private String paymentStatus;

	@Column(name="total_amount")
	private int totalAmount;

	private int USER_user_id;

	public Order() {
	}

	public OrderPK getId() {
		return this.id;
	}

	public void setId(OrderPK id) {
		this.id = id;
	}

	public int getOrderDetailDishId() {
		return this.orderDetailDishId;
	}

	public void setOrderDetailDishId(int orderDetailDishId) {
		this.orderDetailDishId = orderDetailDishId;
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

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getPAYMENT_order_id() {
		return this.PAYMENT_order_id;
	}

	public void setPAYMENT_order_id(int PAYMENT_order_id) {
		this.PAYMENT_order_id = PAYMENT_order_id;
	}

	public int getPAYMENT_payment_id() {
		return this.PAYMENT_payment_id;
	}

	public void setPAYMENT_payment_id(int PAYMENT_payment_id) {
		this.PAYMENT_payment_id = PAYMENT_payment_id;
	}

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getUSER_user_id() {
		return this.USER_user_id;
	}

	public void setUSER_user_id(int USER_user_id) {
		this.USER_user_id = USER_user_id;
	}

}