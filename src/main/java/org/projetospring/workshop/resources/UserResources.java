package org.projetospring.workshop.resources;



import org.projetospring.workshop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"Maria", "maria@gmail.com", "8799197812", "maria21");
        return ResponseEntity.ok().body(user);
    }
}
