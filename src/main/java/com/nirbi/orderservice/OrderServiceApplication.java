package com.nirbi.orderservice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/order")
public class OrderServiceApplication {

	@Autowired
	private OrderDAO orderDao;

	@GetMapping("/fetchOrders")
	public List<Order> retrieveOrders() {
		return orderDao.getOrders().stream().sorted(Comparator.comparing(Order::getName).reversed()).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
