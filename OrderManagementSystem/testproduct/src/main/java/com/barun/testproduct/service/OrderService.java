package com.barun.testproduct.service;

import java.util.List;

import com.barun.testproduct.entity.OrderEntity;

public interface OrderService {
	String createOrder(OrderEntity order);
	
	List<OrderEntity> getOrderByName(String customerName);
	
	OrderEntity getOrderByOrderId(Long orderId);
}
