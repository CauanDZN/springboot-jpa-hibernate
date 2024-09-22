package com.cauandzn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauandzn.course.entities.OrderItem;
import com.cauandzn.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
