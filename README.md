# Java Task Manager API

A simple RESTful API built using Spring Boot to manage tasks with CRUD operations.

## Features
- Create tasks
- View all tasks
- Update tasks
- Delete tasks

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

## API Endpoints

GET /tasks  
POST /tasks  
PUT /tasks/{id}  
DELETE /tasks/{id}

## Sample Request

POST /tasks
{
  "title": "Learn Java",
  "description": "Build backend",
  "completed": false
}

## How to Run
1. Clone the repo
2. Run:
   mvnw spring-boot:run
3. Open:
   http://localhost:8080/tasks