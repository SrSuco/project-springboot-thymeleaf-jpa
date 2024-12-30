package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.repository;

import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    //Metodo para buscar um usuário pelo email
    User findByEmail(String email);
}
