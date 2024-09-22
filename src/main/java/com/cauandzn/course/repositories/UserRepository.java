package com.cauandzn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cauandzn.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
