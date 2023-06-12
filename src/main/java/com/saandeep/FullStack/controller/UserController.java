package com.saandeep.FullStack.controller;

import com.saandeep.FullStack.model.User;
import com.saandeep.FullStack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/user")
    User create(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping("/user")
    List<User> findAll() {
        return repository.findAll();
    }

    @PutMapping("/user/{id}")
    User update(@RequestBody User user, @PathVariable Long id) {
        return repository.save(user);
    }

    @DeleteMapping("/user/{id}")
    void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("user/{name}")
    List<User> findByName(@PathVariable String name) {
        return repository.findByNameContaining(name);
    }
}
