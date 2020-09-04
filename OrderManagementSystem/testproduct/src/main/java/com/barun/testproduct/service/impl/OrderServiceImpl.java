package com.barun.testproduct.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barun.testproduct.entity.OrderEntity;
import com.barun.testproduct.repo.OrderRepo;
import com.barun.testproduct.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	OrderRepo orderRepo;

	@Override
	public String createOrder(OrderEntity order) {
		try {
			order.setOrderDate(LocalDateTime.now());
			orderRepo.save(order);
			return "success with orderid=" + order.getOrderId();
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@Override
	public List<OrderEntity> getOrderByName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderEntity getOrderByOrderId(Long orderId) {
		try {
			return orderRepo.findByOrderId(orderId);
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

}
