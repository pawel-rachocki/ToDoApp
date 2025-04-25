# ✅ ToDo App – Spring Boot + MongoDB + Thymeleaf

A simple ToDo application built with **Spring Boot**, **MongoDB Atlas**, and **Thymeleaf**.  
It allows users to create, complete, and delete tasks through a clean web interface.

---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Data MongoDB
- Thymeleaf (HTML + CSS)
- MongoDB Atlas (cloud)
- Maven

---

## 📷 Screenshot

[![Screenshot of the app](./screenshot.png)](https://github.com/pawel-rachocki/ToDoApp/blob/main/ToDo.png?raw=true)

---


▶️ Running the App

Use Maven to start the application:

./mvnw spring-boot:run

The app will be available at:
http://localhost:8080

🧩 Features

    ➕ Add new tasks

    ✅ Mark tasks as completed

    🗑️ Delete tasks from the list

    💾 All data is stored in MongoDB Atlas (cloud)

📁 Project Structure

src/
├── main/
│   ├── java/com/pawel_rachocki/ToDoApp/
│   │   ├── controller/TaskController.java
│   │   ├── models/Task.java
│   │   ├── repository/TaskRepository.java
│   │   └── services/TaskService.java
│   ├── resources/
│   │   ├── templates/tasks.html
│   │   └── application.properties

✏️ Potential Improvements

    Task editing

    Filtering: Active / Completed

    Improved UI (e.g., Bootstrap or React)

    RESTful API version (e.g., for mobile use)

📄 License

This project is licensed under the MIT License.
It is intended for educational purposes only.
