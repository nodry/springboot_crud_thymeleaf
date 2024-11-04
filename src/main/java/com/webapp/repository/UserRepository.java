package com.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
