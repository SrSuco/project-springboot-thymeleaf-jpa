package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String password;
    private String profile;
}
