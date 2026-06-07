Quotes App Backend
A Spring Boot REST API backend that provides categorized quotes (Motivational, Wisdom, Emotional, Life, and Women) and handles user registration.

🚀 Features
User Registration: Create and store new user accounts in the database.
Categorized Quotes API: Retrieve quotes from multiple categories:
Motivational
Wisdom
Emotional
Life
Women
CORS Enabled: Cross-Origin Resource Sharing (@CrossOrigin) is enabled on all endpoints to easily connect with web frontends.
🛠️ Tech Stack
Java: Version 17
Framework: Spring Boot (v3.0.5)
Database Access: Spring Data JPA (Hibernate)
Database: MySQL (using mysql-connector-j)
Utility: Lombok (for reducing boilerplates like getters, setters, and constructors)
Build Tool: Maven
📦 Project Structure
text

src/main/java/com/spring/Quotes/
├── QuotesApplication.java          # Application entrypoint
├── controller/
│   └── UserController.java         # REST Controller exposing the endpoints
├── model/                          # JPA Entities
│   ├── User.java                   # User entity (table: registration)
│   ├── Motivational.java           # Motivational quote entity (table: motivational)
│   ├── Wisdom.java                 # Wisdom quote entity (table: wisdom)
│   ├── Emotional.java              # Emotional quote entity (table: emotional)
│   ├── Life.java                   # Life quote entity (table: life)
│   └── Women.java                  # Women quote entity (table: women)
├── respository/                    # Spring Data JPA Repositories
│   ├── UserRespository.java
│   ├── MotivationalRespository.java
│   ├── WisdomRespository.java
│   ├── EmotionalRespository.java
│   ├── LifeRespository.java
│   └── WomenRespository.java
└── service/                        # Service layer encapsulating business logic
    ├── UserService.java
    ├── MotivationalService.java
    ├── WisdomService.java
    ├── EmotionalService.java
    ├── LifeService.java
    └── WomenService.java
🗄️ Database Configuration
By default, the application connects to a MySQL database with the following details configured in 
application.properties
:

Database Name: quotes
Port: 3306 (default MySQL port)
Username: hbstudent
Password: hbstudent
DDL Mode: update (Hibernate will automatically update the database schema if tables are missing or modified)
Table Structures
1. registration (User Table)
id (int, Primary Key, Auto-Increment)
name (varchar)
email (varchar)
password (varchar)
2. Quote Tables (motivational, wisdom, emotional, life, women)
Each category corresponds to its own table with the following columns:

id (int, Primary Key)
quote_text (varchar(1000)) - text of the quote
author (varchar(1000)) - author of the quote
title (varchar(1000)) - optional title
story (varchar(1000)) - optional background story/context
🔌 API Endpoints
All endpoints are prefixed with /api/v1/quotes. The server runs on port 8081 by default.

1. User Registration
Endpoint: POST http://localhost:8081/api/v1/quotes/add
Headers: Content-Type: application/json
Request Body:
json

{
  "name": "John Doe",
  "email": "johndoe@example.com",
  "password": "securepassword123"
}
Response: Returns the saved User object.
2. Fetch Quotes
All GET requests return a JSON list of quote objects. Each quote has the structure:

json

[
  {
    "id": 1,
    "quotes": "The quote text here...",
    "author": "Author Name",
    "title": "Quote Title",
    "story": "Optional story or context"
  }
]
Motivational Quotes: GET http://localhost:8081/api/v1/quotes/motivational
Wisdom Quotes: GET http://localhost:8081/api/v1/quotes/wisdom
Emotional Quotes: GET http://localhost:8081/api/v1/quotes/emotional
Life Quotes: GET http://localhost:8081/api/v1/quotes/life
Women Quotes: GET http://localhost:8081/api/v1/quotes/women
🏁 Getting Started
Prerequisites
Java Development Kit (JDK) 17 installed.
MySQL Server running locally.
A MySQL database named quotes created. E.g.,
sql

CREATE DATABASE quotes;
Running the Application
Open the project root folder in a terminal.
Ensure database properties match your local MySQL configuration in 
application.properties
.
Start the application using the Maven wrapper:
bash

./mvnw spring-boot:run
The backend server will start at http://localhost:8081. You can test endpoints via Postman, cURL, or a web frontend
