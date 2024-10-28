Spring Boot Practice by Luv2Code
This repository is for practicing Spring Boot fundamentals, based on the examples and exercises provided by Luv2Code. It covers key Spring Boot features and configurations, including REST APIs, dependency injection, and integration with Spring Data JPA.

Contents
RESTful APIs: Building REST endpoints, handling HTTP requests, and creating response entities.
Dependency Injection: Implementing loose coupling using Spring’s dependency injection.
Spring Data JPA: Connecting with databases, using CRUD operations, and managing entity relationships.
Configuration & Properties: Configuring application properties and environment setups.
Getting Started
To run the projects in this repository, ensure you have the following:

Java JDK 11 or later
Maven (for dependency management)
Spring Boot (version used in each project is specified in the pom.xml file)
Cloning the Repository
bash
Copy code
git clone https://github.com/syed-owais/spring-boot-practice-by-luv2code.git
cd spring-boot-practice-by-luv2code
Running the Application
Each module within this repository can be run as a standalone Spring Boot application. To start any module:

Navigate to the module directory.

Use the following Maven command to start the application:

bash
Copy code
mvn spring-boot:run
Access the application at http://localhost:8080 (or the port specified in application.properties).

Modules
1. spring-boot-crud-demo
Demonstrates CRUD operations using Spring Data JPA and a REST API for managing entities.

2. spring-boot-rest-demo
An example of creating RESTful APIs with Spring Boot, handling HTTP methods (GET, POST, PUT, DELETE).

3. spring-boot-jpa-demo
Introduces JPA with Spring Boot, focusing on data persistence and database management with Spring Data JPA.

Resources
This repository is inspired by the Luv2Code Spring Boot tutorials, which are great resources for deepening Spring Boot knowledge:

Luv2Code YouTube Channel
Luv2Code Courses
Contributing
This repository is primarily for learning purposes, but suggestions and improvements are welcome! Feel free to open issues or submit pull requests.

License
This project is open-source and available under the MIT License.
