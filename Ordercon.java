package com.tnsif.Shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.Shopping.entity.Order;
import com.tnsif.Shopping.repository.OrderRepository;

@RestController
public class OrderController {

    @Autowired
    OrderRepository repo;

    @PostMapping("/order")
    public Order addOrder(@RequestBody Order order) {
        return repo.save(order);
    }

    @GetMapping("/order")
    public List<Order> getOrders() {
        return repo.findAll();
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(Integer id) {
        return repo.findById(id).orElse(null);
    }
}

@RestController
class EmployeeController {

    @Autowired
    OrderRepository repo;

    @PostMapping("/employee")
    public Order addEmployee(@RequestBody Order employee) {
        return repo.save(employee);
    }

    @GetMapping("/employee")
    public List<Order> getEmployees() {
        return repo.findAll();
    }

    @GetMapping("/employee/{id}")
    public Order getEmployeeById(Integer id) {
        return repo.findById(id).orElse(null);
    }
}
