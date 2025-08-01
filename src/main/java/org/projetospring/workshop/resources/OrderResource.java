package org.projetospring.workshop.resources;

import org.projetospring.workshop.entities.Order;
import org.projetospring.workshop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/orders")
public class OrderResource {


    @Autowired
    private PathMatcher pathMatcher;
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){

        List<Order> list = orderService.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findByid(@PathVariable Long id){
        Order obj =  orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
