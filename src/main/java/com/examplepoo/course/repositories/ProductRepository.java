package com.examplepoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplepoo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
