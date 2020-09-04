package com.barun.testproduct.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barun.testproduct.entity.OrderItemEntity;
import com.barun.testproduct.exception.OrderNotfoundException;
import com.barun.testproduct.repo.OrderItemRepo;
import com.barun.testproduct.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {
	private static final Logger log = LoggerFactory.getLogger(OrderItemServiceImpl.class);

	@Autowired
	OrderItemRepo orderItemRepo;

	@Override
	public String createOrderItem(OrderItemEntity orderItem) {
		try {
			orderItemRepo.save(orderItem);
			return "successfully created";
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@Override
	public List<OrderItemEntity> getAllItemEntity() {
		try {
			if(null == orderItemRepo.findAll())throw new OrderNotfoundException();
			return orderItemRepo.findAll();
		} catch (Exception e) {
			log.error("error {}", e);
		}
		return null;
	}

	@Override
	public OrderItemEntity getOrderItemByProductCode(String productCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItemEntity getOrderItemByItemId(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
