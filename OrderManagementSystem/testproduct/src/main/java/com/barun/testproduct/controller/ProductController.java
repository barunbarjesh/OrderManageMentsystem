package com.barun.testproduct.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barun.testproduct.entity.OrderEntity;
import com.barun.testproduct.entity.OrderItemEntity;
import com.barun.testproduct.exception.OrderNotfoundException;
import com.barun.testproduct.service.OrderItemService;
import com.barun.testproduct.service.OrderService;

@RestController
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired

	OrderItemService orderItemService;
	@Autowired
	OrderService orderService;

	@PostMapping("/createorderitem")
	public String createOrderItem(@RequestBody OrderItemEntity orderItem) {
		try {
			return orderItemService.createOrderItem(orderItem);
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@GetMapping("/getallorderitem")
	private List<OrderItemEntity> listOrderItemByOrderId() {
		try {
			if(null == orderItemService.getAllItemEntity())throw new OrderNotfoundException();
			else
			return orderItemService.getAllItemEntity();
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@PostMapping("/createorder")
	public String createOrderItem(@RequestBody OrderEntity order) {
		try {
			return orderService.createOrder(order);
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@GetMapping("/getcreateorder/{orderId}")
	private OrderEntity listOrderItemByOrderId(@PathVariable Long orderId) {
		try {
			return orderService.getOrderByOrderId(orderId);
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}
}
