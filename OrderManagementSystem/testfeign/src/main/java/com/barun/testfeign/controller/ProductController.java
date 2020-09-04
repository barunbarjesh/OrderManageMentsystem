package com.barun.testfeign.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barun.testfeign.dto.Order;
import com.barun.testfeign.dto.OrderItem;
import com.barun.testfeign.service.FeignTestService;

@RestController
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	FeignTestService feignService;

	@PostMapping("/createorderitem")
	public String createOrderItem(@RequestBody OrderItem orderItem) {
		try {
			return feignService.createOrderItem(orderItem);
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@GetMapping("/getallorderitem")
	private List<OrderItem> listOrderItemByOrderId() {
		try {
			return feignService.gettAllOrderItem();
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@PostMapping("/createorder")
	public String createOrderItem(@RequestBody Order order) {
		try {
			return feignService.createOrderItem(order);
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@GetMapping("/getcreateorder/{orderId}")
	private Order listOrderItemByOrderId(@PathVariable Long orderId) {
		try {
			return feignService.listOrderItemByOrderId(orderId);
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}
}
