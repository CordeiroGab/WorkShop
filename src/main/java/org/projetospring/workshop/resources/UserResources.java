package org.projetospring.workshop.resources;

import org.projetospring.workshop.entities.User;
import org.projetospring.workshop.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/users")
public class UserResources {

    @Autowired
    private UserServices userServices;
    @Autowired
    private PathMatcher pathMatcher;

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
}