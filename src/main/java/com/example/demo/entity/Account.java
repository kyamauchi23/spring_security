package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;


@Entity
@Data
public class Account {

    @Id
    private String username;
    private String password;
    private String role;
}
