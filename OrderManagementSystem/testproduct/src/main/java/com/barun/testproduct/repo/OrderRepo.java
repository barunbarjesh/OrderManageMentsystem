package com.barun.testproduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barun.testproduct.entity.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, Long> {

	OrderEntity findByOrderId(Long orderId);
}
