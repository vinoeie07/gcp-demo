package com.springboot.project.gcpdemo.controller;

import com.springboot.project.gcpdemo.model.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserDetailsController {
    @GetMapping("/userList")
    public ResponseEntity<List<UserDetails>> getAllUserDetails(@RequestParam(required = false) String userName) {
        try {
            List<UserDetails> list = new ArrayList();
            UserDetails user1 = new UserDetails("Vinodkumar", "Velachery", "Male");
            UserDetails user2 = new UserDetails("Nivedha", "Velachery", "Female");
            list.add(user1);
            list.add(user2);

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
