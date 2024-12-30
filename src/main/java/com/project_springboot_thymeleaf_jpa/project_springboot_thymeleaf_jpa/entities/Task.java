package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    private Long id;
    private String title;
    private String description;
    private String status;
    private String relatedProject;
    private String assignedTo;
    private String createdDate;
}
