package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class Account {

    @Id
    private String username;
    private String password;
    private String role;
}
