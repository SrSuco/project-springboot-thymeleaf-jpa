package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.controller;

import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Project;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Status;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Task;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.repository.ProjectRepository;
import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TaskWebSocketController taskWebSocketController;



    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "task/list";
    }

    @GetMapping("/new")
    public String newTaskForm(Model model) {
        model.addAttribute("task", new Task());
        model.addAttribute("statuses", Status.values());
        model.addAttribute("projects", projectRepository.findAll());
        return "task/form"; // Renderiza o template task/form.html
    }

    @GetMapping("/{id}/edit")
    public String editTaskForm(@PathVariable UUID id, Model model) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            model.addAttribute("task", task.get());
            model.addAttribute("statuses", Status.values());
            model.addAttribute("projects", projectRepository.findAll());
            return "task/form";
        }
        return "redirect:/tasks";
    }

    @PostMapping
    public String saveTask(@ModelAttribute Task task) {
        Task savedTask = taskRepository.save(task);
        taskWebSocketController.sendTaskUpdate(savedTask); // Notifica clientes sobre a alteração
        return "redirect:/tasks";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable UUID id) {
        taskRepository.deleteById(id);
        taskWebSocketController.sendTaskUpdate(null);
        return "redirect:/tasks";
    }

    @GetMapping("/{id}")
    public String taskDetails(@PathVariable UUID id, Model model) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            model.addAttribute("task", task.get());
            return "task/details";
        }
        return "redirect:/tasks";
    }

}
