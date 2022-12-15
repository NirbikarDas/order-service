package com.nirbi.orderservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {
	public List<Order> getOrders() {
		return Stream
				.of(new Order(300, "Mobile", 2, 60000.0D), new Order(700, "Tablet", 1, 30000.0D),
						new Order(600, "Laptop", 4, 240000.0D), new Order(900, "HeadSet", 5, 90000.0D))
				.collect(Collectors.toList());
	}
}
