package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.repository;

import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {

    // Buscar projetos pelo nome.
    List<Project> findByNameContainingIgnoreCase(String name);

    // Buscar projetos criados por um usuário.
    List<Project> findByCreatedById(UUID userId);
}
