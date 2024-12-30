package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.repository;

import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Status;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {

    // Buscar por status
    List<Task> findByStatus(Status status);

    // Buscar por título (nome)
    List<Task> findByTitleContainingIgnoreCase(String title);

    // Buscar por responsável
    @Query("SELECT t FROM Task t WHERE t.assignedTo.id = :userId")
    List<Task> findByAssignedTo(UUID userId);
}