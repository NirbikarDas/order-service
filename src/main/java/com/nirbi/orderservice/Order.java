package com.nirbi.orderservice;

public class Order {
	private Integer id;
	private String name;
	private Integer quantity;
	private Double price;

	public Order() {
		super();
	}

	public Order(Integer id, String name, Integer quantity, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
