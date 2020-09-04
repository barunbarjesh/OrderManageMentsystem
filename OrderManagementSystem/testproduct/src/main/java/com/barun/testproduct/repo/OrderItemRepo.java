package com.barun.testproduct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barun.testproduct.entity.OrderItemEntity;

public interface OrderItemRepo extends JpaRepository<OrderItemEntity, Long>{

}
