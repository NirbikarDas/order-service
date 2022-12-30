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

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderServiceApplication {

	@Autowired
	private OrderDAO orderDao;

	@GetMapping("/fetchOrders")
	public List<Order> retrieveOrders() {
		log.info("Received request to retrieve orders .");
		log.info("Entering into fetch order method .");
		log.info("Method is handling the request .");
		return orderDao.getOrders().stream().sorted(Comparator.comparing(Order::getName)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
