package com.cauandzn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauandzn.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
