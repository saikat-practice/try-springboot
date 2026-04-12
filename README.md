# Spring Boot Practice Project

## Project Overview
This project is a practice implementation of Spring Boot, a powerful framework used for building Java-based web applications. The aim of this project is to explore and understand the core features of Spring Boot while developing a working application.

## Technology Stack
- **Java 17**: The programming language used to build the application.
- **Spring Boot**: The main framework used for building the application.
- **Maven**: Dependency management and build tool.
- **Spring Data JPA**: For database operations.
- **RESTful Web Services**: The application will expose REST APIs to interact with clients.

## Setup Instructions
0. **Start Git**:  
   `git config --global user.name "OwnerName"`
   `git config --global user.email "ownerid@mail.com"` 
1. **Clone the repository**:  
   `git clone https://github.com/saikat-practice/try-springboot.git`

2. **Navigate to the project directory**:  
   `cd try-springboot`

3. **Build the project**:  
   Use Maven to build the project:  
   `mvn clean install`

4. **Run the application**:  
   `mvn spring-boot:run`

## How to Run the Application
- After running the application, it can be accessed at `http://localhost:8080` (default port).
- Use tools like Postman or your web browser to test the API endpoints.

## Dependencies
- **Spring Web**: For building web applications, including RESTful applications.
- **Spring Boot DevTools**: For enhanced development experience.
- **Spring Data JPA**: For interacting with the database.
- **H2 Database**: Lightweight in-memory database for testing and development.

---

## Code Changes Summary

### Key Features Implemented

#### 1. Bean Scopes (PR #4)
- **Singleton Scope**: Single instance of bean for entire application
- **Prototype Scope**: New instance created for each request
- Test coverage and validation included
- Working implementation with application logs

#### 2. Bean Lifecycle (PR #2)
- PostConstruct implementation
- PreDestroy implementation
- Circular dependency resolution using setter injection
- Component primary annotation usage

#### 3. Core Features (PR #1)
- REST API Interceptor
- Property file configuration
- Bean Exception handling
- Greet API endpoint

#### 4. Initial Setup
- Project initialization with Maven
- Spring Boot configuration
- H2 in-memory database setup
- Basic REST endpoints

---

## Learning Resources
- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Baeldung's Guide to Spring Boot](https://www.baeldung.com/spring-boot)
- [Java Brains Spring Boot Course](https://www.javabrains.io/courses/spring-boot)
- [YouTube Tutorials on Spring Boot](https://www.youtube.com/results?search_query=spring+boot)

## Author
- Saikat
