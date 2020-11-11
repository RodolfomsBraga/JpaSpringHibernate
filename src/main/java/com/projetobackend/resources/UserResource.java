package com.projetobackend.resources;

import com.projetobackend.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1,"Rodolfinis", "rodolfinis@email","1234");
        return ResponseEntity.ok().body(user);
    }
}
