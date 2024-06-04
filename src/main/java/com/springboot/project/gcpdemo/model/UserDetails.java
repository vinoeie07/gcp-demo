package com.springboot.project.gcpdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserDetails {
    private String userName;
    private String userAddress;
    private String gender;
}

