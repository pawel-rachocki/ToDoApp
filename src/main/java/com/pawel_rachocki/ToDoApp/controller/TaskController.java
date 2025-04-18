package com.pawel_rachocki.ToDoApp.controller;

import com.pawel_rachocki.ToDoApp.models.Task;
import com.pawel_rachocki.ToDoApp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks"; // Render tasks.html
    }

    @PostMapping("/add")
    public String createTask(@RequestParam String name) {
        taskService.createTask(name);
        return "redirect:/";
    }

    @PostMapping("/complete")
    public String completeTask(@RequestParam String id) {
        taskService.completeTask(id);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTask(@RequestParam String id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }


}
