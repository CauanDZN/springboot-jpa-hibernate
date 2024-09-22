package com.cauandzn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauandzn.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
