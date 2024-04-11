package com.delta380.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta380.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
