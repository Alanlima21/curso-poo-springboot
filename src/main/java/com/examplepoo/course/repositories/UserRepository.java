package com.examplepoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplepoo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
