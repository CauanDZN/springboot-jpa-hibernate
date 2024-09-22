package com.cauandzn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauandzn.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
