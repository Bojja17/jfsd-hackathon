package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role; // "ROLE_TEACHER" or "ROLE_STUDENT"
    
    
}