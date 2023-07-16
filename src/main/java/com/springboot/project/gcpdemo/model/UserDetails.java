package com.springboot.project.gcpdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDetails {
    private String userName;
    private String userAddress;
    private String gender;
}

