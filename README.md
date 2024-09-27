**Task Management System**

A Spring Boot-based Task Management System with Thymeleaf integration. This project allows users to create, edit, update, and delete tasks, storing data in a MySQL database.

Table of Contents
Getting Started
Features
Technologies Used
Database Setup
Project Structure
How to Run
License
Getting Started
Prerequisites
Java 8 or later
Maven or Gradle
MySQL
An IDE (e.g., IntelliJ IDEA, Eclipse)
Git
Features
View a list of tasks
Create new tasks with a title, description, and status
Edit existing tasks
Delete tasks
Integration with a MySQL database for data persistence
Dynamic HTML rendering using Thymeleaf
Technologies Used
Spring Boot: For building the backend
Thymeleaf: For HTML templating
Spring Data JPA: For database interactions
MySQL: As the database
Lombok (optional): To reduce boilerplate code
Database Setup
Create a MySQL database named task_management_db:
sql
Copy code
CREATE DATABASE task_management_db;
Update the application.properties file with your database details:
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/task_management_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

How to Run
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/task_management_system.git
Navigate to the project directory:

bash
Copy code
cd task_management_system
Configure the database connection in application.properties.

Run the application using Maven or Gradle:

bash
Copy code
mvn spring-boot:run
or

bash
Copy code
gradle bootRun
Access the app at http://localhost:8080/tasks.

License
This project is licensed under the MIT License.
