package com.algostudioapp.controller;

import com.algostudioapp.model.AlgoUser;
import com.algostudioapp.service.AlgoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class AlgoUserController {
    @Autowired
    private AlgoUserService userService;
    @GetMapping
    public ResponseEntity<AlgoUser> fetchUser(String username){
        return ResponseEntity.ok(userService.fetchUser(username));
    }
}
