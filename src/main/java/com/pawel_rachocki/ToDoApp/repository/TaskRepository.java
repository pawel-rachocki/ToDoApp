package com.pawel_rachocki.ToDoApp.repository;

import com.pawel_rachocki.ToDoApp.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, Long> {

}
