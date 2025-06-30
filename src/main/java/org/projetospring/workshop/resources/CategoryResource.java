package org.projetospring.workshop.resources;

import org.projetospring.workshop.entities.Category;
import org.projetospring.workshop.entities.Order;
import org.projetospring.workshop.services.CategoryService;
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
@RequestMapping(value = "/categories")
public class CategoryResource {



    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){

        List<Category> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findByid(@PathVariable Long id){
        Category obj =  categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
