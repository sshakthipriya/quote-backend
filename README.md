A Spring Boot REST API backend that provides categorized quotes (Motivational, Wisdom, Emotional, Life, and Women) and handles user registration.

Features

User Registration — Create and persist user accounts via REST
Categorized Quotes — Five curated quote categories served as JSON
CORS Enabled — Ready to connect with any Angular or web frontend out of the box
Layered Architecture — Clean separation across Controller → Service → Repository → Entity


Tech Stack
Java: Version 17
Framework: Spring Boot (v3.0.5)
Database Access: Spring Data JPA (Hibernate)
Database: MySQL (using mysql-connector-j)
Utility: Lombok (for reducing boilerplates like getters, setters, and constructors)
Build Tool: Maven

📁 Project Structure
src/main/java/com/spring/Quotes/
├── QuotesApplication.java          # Application entry point
│
├── controller/
│   └── UserController.java         # REST endpoints (CORS enabled)
│
├── model/                          # JPA Entities
│   ├── User.java                   # Users → table: registration
│   ├── Motivational.java           # table: motivational
│   ├── Wisdom.java                 # table: wisdom
│   ├── Emotional.java              # table: emotional
│   ├── Life.java                   # table: life
│   └── Women.java                  # table: women
│
├── repository/                     # Spring Data JPA Repositories
│   ├── UserRepository.java
│   ├── MotivationalRepository.java
│   ├── WisdomRepository.java
│   ├── EmotionalRepository.java
│   ├── LifeRepository.java
│   └── WomenRepository.java
│
└── service/                        # Business logic layer
    ├── UserService.java
    ├── MotivationalService.java
    ├── WisdomService.java
    ├── EmotionalService.java
    ├── LifeService.java
    └── WomenService.java

🗄️ Database Setup
Prerequisites
Create a MySQL database named quotes before running the app:
sqlCREATE DATABASE quotes;
Default Configuration (application.properties)
propertiesspring.datasource.url=jdbc:mysql://localhost:3306/quotes
spring.datasource.username=hbstudent
spring.datasource.password=hbstudent
spring.jpa.hibernate.ddl-auto=update
server.port=8081

⚠️ Update the username and password to match your local MySQL setup before running.

Table Structures
1. registration (User Table)
id (int, Primary Key, Auto-Increment)
name (varchar)
email (varchar)
password (varchar)

3. Quote Tables (motivational, wisdom, emotional, life, women)
Each category corresponds to its own table with the following columns:
id (int, Primary Key)
quote_text (varchar(1000)) - text of the quote
author (varchar(1000)) - author of the quote
title (varchar(1000)) - optional title
story (varchar(1000)) - optional background story/context

API Endpoints
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
1. Clone the repository
bash git clone https://github.com/sshakthipriya/backend-resume.git
cd backend-resume

2. Configure the database
Update src/main/resources/application.properties with your MySQL credentials:
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

3. Run the application
bash./mvnw spring-boot:run
The API will be live at http://localhost:8081.

5. Test the endpoints
Using cURL:
bash curl http://localhost:8081/api/v1/quotes/motivational
Using Postman: Import the base URL and hit any of the GET endpoints above.
