package com.pawel_rachocki.ToDoApp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "todo-app")
@Data
public class Task {
    @Id
    private String id;
    private String name;
    private boolean isCompleted;


}
