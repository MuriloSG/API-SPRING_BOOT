package com.example.apilogin.controllers;

import com.example.apilogin.dto.ResponseListUsersDTO;
import com.example.apilogin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping
    public ResponseEntity getUsers(){
        List<ResponseListUsersDTO> usersList = this.userRepository.findAll().stream().map(ResponseListUsersDTO::new).toList();
        return ResponseEntity.ok(usersList);
    }
}
