package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Attachment {

    @Id
    private Long id;
    private String fileName;
    private String path;
    private String relatedTask;
}
