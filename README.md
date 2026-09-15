# 📚 Library Management System

A backend REST API for managing **books, users, and issued books** using **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL**.

This project demonstrates CRUD-style REST API development, database integration, input validation, exception handling, and Swagger API documentation.

## 🚀 Features

- Add and retrieve library books
- Search books by author
- Search books by subject
- Add and retrieve library users
- Retrieve a user by ID
- Issue books to users
- Retrieve all issued books
- Search issued books by user ID
- Input validation for books and users
- Custom exception handling for missing users/books
- Swagger API documentation

## 🛠️ Tech Stack

- **Java 11**
- **Spring Boot 2.4.7**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Lombok**
- **Swagger / Springfox**
- **Maven**

## 📁 Project Structure

```text
src/
└── main/
    ├── java/com/example/library_management/
    │   ├── Controller/
    │   │   ├── BookController.java
    │   │   ├── IssuedBooksController.java
    │   │   └── UserController.java
    │   │
    │   ├── Exception/
    │   │   ├── BookNotFoundException.java
    │   │   ├── UserNotFoundException.java
    │   │   └── CustomGlobalExceptionHandler.java
    │   │
    │   ├── Model/
    │   │   ├── Book.java
    │   │   ├── IssuedBooks.java
    │   │   └── User.java
    │   │
    │   ├── Repository/
    │   │   ├── BookRepository.java
    │   │   ├── IssuedBooksRepository.java
    │   │   └── UserRepository.java
    │   │
    │   ├── Util/
    │   │   ├── BookValidator.java
    │   │   └── UserValidator.java
    │   │
    │   └── LibraryManagementApplication.java
    │
    └── resources/
        └── application.properties
```

## ⚙️ Prerequisites

Make sure the following are installed:

- Java JDK 11
- MySQL
- Maven (optional because the project includes Maven Wrapper)
- Git
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code

## 🗄️ Database Setup

The application uses a MySQL database named `library`.

Create the database:

```sql
CREATE DATABASE library;
```

Then configure your MySQL credentials in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=create
```

> **Important:** Do not upload real database passwords or other secrets to a public GitHub repository. Use your own local credentials or environment variables.

## ▶️ Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/nikhildholiwal/Library-Management-System.git
```

### 2. Open the project

```bash
cd Library-Management-System
```

### 3. Build the project

Using Maven:

```bash
mvn clean install
```

Or use the included Maven Wrapper.

**Windows:**

```bash
mvnw.cmd clean install
```

**Linux/macOS:**

```bash
./mvnw clean install
```

### 4. Start the application

```bash
mvn spring-boot:run
```

Or run:

```text
LibraryManagementApplication.java
```

from your IDE.

The application will start on:

```text
http://localhost:8080
```

## 📡 API Endpoints

### 📖 Book APIs

| Method | Endpoint | Description |
|---|---|---|
| GET | `/books` | Get all books |
| POST | `/books` | Add a new book |
| GET | `/searchBooksByAuthor?q={author}` | Search books by author |
| GET | `/searchBooksBySubject?q={subject}` | Search books by subject |

### 👤 User APIs

| Method | Endpoint | Description |
|---|---|---|
| GET | `/users` | Get all users |
| POST | `/users` | Create a new user |
| GET | `/users/{id}` | Get a user by ID |

### 📚 Issued Book APIs

| Method | Endpoint | Description |
|---|---|---|
| GET | `/issuedBooks` | Get all issued books |
| POST | `/issueBook` | Issue a book |
| GET | `/searchIssuedBooksByUser?q={userId}` | Search issued books by user ID |

## 📝 Sample Requests

### Add a Book

**POST** `/books`

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "subject": "Software Development"
}
```

### Create a User

**POST** `/users`

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "mobile": "9876543210"
}
```

### Issue a Book

**POST** `/issueBook`

```json
{
  "user_id": 1,
  "book_id": 1
}
```

The application automatically sets the issued book status to:

```text
issued
```

## 📑 Swagger API Documentation

Swagger is enabled in the application for exploring and testing the REST APIs.

After starting the application, open:

```text
http://localhost:8080/swagger-ui.html
```

> If Swagger UI does not load with your browser/Spring Boot setup, the APIs can still be tested using Postman or another REST client.

## 🧩 Architecture

The project follows a simple layered architecture:

```text
Client
   │
   ▼
Controller
   │
   ▼
Repository
   │
   ▼
Spring Data JPA / Hibernate
   │
   ▼
MySQL Database
```

### Main Layers

**Controller**
- Handles HTTP requests
- Exposes REST endpoints

**Model**
- Defines database entities such as `Book`, `User`, and `IssuedBooks`

**Repository**
- Uses Spring Data JPA for database operations

**Exception**
- Handles cases such as missing users or books

**Util**
- Contains validation logic for incoming data

## 🧪 Testing

The project includes a Spring Boot test that verifies that the application context loads successfully.

Run tests with:

```bash
mvn test
```

## 🔮 Future Improvements

- Add update and delete APIs for books and users
- Add proper relationships between `User`, `Book`, and `IssuedBooks`
- Add book return functionality
- Add fine calculation for overdue books
- Add authentication and authorization using Spring Security
- Add admin/user roles
- Improve validation using Bean Validation (`@Valid`, `@NotNull`, etc.)
- Add pagination and sorting
- Add more unit and integration tests
- Use environment variables for database configuration
- Upgrade to a newer Spring Boot/Springfox-compatible API documentation solution

## 👨‍💻 Author

**Nikhil Kumar**

GitHub: https://github.com/nikhildholiwal

---

⭐ If you find this project useful, consider giving the repository a star!
