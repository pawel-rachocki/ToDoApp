package com.pawel_rachocki.ToDoApp.services;

import com.pawel_rachocki.ToDoApp.models.Task;
import com.pawel_rachocki.ToDoApp.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String name) {
        Task task = new Task();
        task.setName(name);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void completeTask(String id) {
        Optional<Task> task = taskRepository.findById(id);
        task.ifPresent(t -> {
            t.setCompleted(true);
            taskRepository.save(t);
        });
    }
}
