package com.examplepoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplepoo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
