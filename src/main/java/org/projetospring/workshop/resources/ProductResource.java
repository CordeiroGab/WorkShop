package org.projetospring.workshop.resources;

import org.projetospring.workshop.entities.Product;
import org.projetospring.workshop.entities.User;
import org.projetospring.workshop.services.ProductService;
import org.projetospring.workshop.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value ="/products")
public class ProductResource {


    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){

        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByid(@PathVariable Long id){
        Product obj =  productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
