package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    private Long id;
    private String projectName;
    private String projectDescription;
    private String createdBy;
    private String createdDate;
}
