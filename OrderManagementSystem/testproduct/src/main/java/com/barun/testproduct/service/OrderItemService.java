package com.barun.testproduct.service;

import java.util.List;

import com.barun.testproduct.entity.OrderItemEntity;

public interface OrderItemService {
	String createOrderItem(OrderItemEntity orderItem);
	List<OrderItemEntity> getAllItemEntity();
    OrderItemEntity getOrderItemByProductCode(String productCode);
    OrderItemEntity getOrderItemByItemId(String itemId);
}
