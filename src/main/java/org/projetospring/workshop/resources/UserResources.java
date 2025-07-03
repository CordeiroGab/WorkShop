package org.projetospring.workshop.resources;

import org.projetospring.workshop.entities.Order;
import org.projetospring.workshop.entities.User;
import org.projetospring.workshop.services.OrderService;
import org.projetospring.workshop.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/users")
public class UserResources {


    @Autowired
    private PathMatcher pathMatcher;
    @Autowired
    private UserServices userServices;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = userServices.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByid(@PathVariable Long id){
        User obj =  userServices.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj){
        obj = userServices.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userServices.delete(id);
        return ResponseEntity.noContent().build();

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj){
        obj = userServices.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}