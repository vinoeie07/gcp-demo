package com.springboot.project.gcpdemo.controller;

import com.springboot.project.gcpdemo.model.UserDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserDetailsController {

    @Value("${elderDaughter:V Chetnaa Shree}")
    private String elder;

    @Value("${yougerDaughter:V Meghnaa Shree}")
    private String younger;
    @GetMapping("/userList")
    public ResponseEntity<List<UserDetails>> getAllUserDetails(@RequestParam(required = false) String userName) {
        try {
            List<UserDetails> list = new ArrayList();
            UserDetails user1 = new UserDetails("Vinodkumar", "Velachery", "Male");
            UserDetails user2 = new UserDetails("Nivedha", "Velachery", "Female");
            list.add(user1);
            list.add(user2);
            list.add(new UserDetails(elder, "Velachery", "Female"));
            list.add(new UserDetails(younger, "Velachery", "Female"));

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
