package org.projetospring.workshop.services;

import org.aspectj.weaver.ast.Or;
import org.projetospring.workshop.entities.Order;
import org.projetospring.workshop.entities.User;
import org.projetospring.workshop.repositories.OrderRepository;
import org.projetospring.workshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
