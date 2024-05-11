package com.tnsif.Shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsif.Shopping.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom queries for Customer entity can be added here
}
