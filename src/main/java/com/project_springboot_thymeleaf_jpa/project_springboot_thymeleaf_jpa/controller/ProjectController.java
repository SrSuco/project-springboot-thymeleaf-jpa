package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.controller;

import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Project;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.User;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.repository.ProjectRepository;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String listProjects(Model model) {
        model.addAttribute("projects", projectRepository.findAll());
        return "project/list";
    }

    @GetMapping("/new")
    public String newProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "project/form";
    }

    @GetMapping("/{id}/edit")
    public String editProjectForm(@PathVariable UUID id, Model model) {
        Optional<Project> project = projectRepository.findById(id);
        if (project.isPresent()) {
            model.addAttribute("project", project.get());
        } else {
            return "redirect:/projects";
        }
        return "project/form";
    }

    @PostMapping
    public String saveProject(@ModelAttribute Project project) {
        projectRepository.save(project);
        return "redirect:/projects";
    }

    @GetMapping("/{id}/delete")
    public String deleteProject(@PathVariable UUID id) {
        projectRepository.deleteById(id);
        return "redirect:/projects";
    }
}
