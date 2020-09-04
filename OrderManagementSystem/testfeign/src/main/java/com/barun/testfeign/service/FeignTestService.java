package com.barun.testfeign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.barun.testfeign.dto.Order;
import com.barun.testfeign.dto.OrderItem;

@FeignClient(value = "jplaceholder", url = "http://localhost:2323/")
public interface FeignTestService {

	@GetMapping(value = "/getallorderitem")
	List<OrderItem> gettAllOrderItem();
	
	@PostMapping("/createorderitem")
	String createOrderItem(@RequestBody OrderItem orderItem);
	
	@PostMapping("/createorder")
	String createOrderItem(@RequestBody Order order);
	
	
	@GetMapping("/getcreateorder/{orderId}")
	Order listOrderItemByOrderId(@PathVariable Long orderId);
}
