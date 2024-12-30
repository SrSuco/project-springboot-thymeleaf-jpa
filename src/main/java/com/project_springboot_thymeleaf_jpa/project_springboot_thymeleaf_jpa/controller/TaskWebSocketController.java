package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.controller;

import com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class TaskWebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendTaskUpdate(Task task) {
        messagingTemplate.convertAndSend("/topic/tasks", task);
    }
}