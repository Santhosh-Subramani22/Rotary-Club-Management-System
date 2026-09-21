# Rotary Club Management System

An enterprise-grade, full-stack civic management web application built with **Java 17, Spring Boot 3.2.5, Spring Data JPA, MySQL 8.0, and Modern Vanilla JavaScript**.

## 🌟 Overview
Designed for chartered clubs under Rotary International (e.g., Rotary District 2982), this application eliminates fragmented manual record-keeping by providing centralized membership tracking, administrative role-based access, fellowship meeting agendas, and philanthropic project tracking.

## 🚀 Tech Stack
* **Backend:** Java 17, Spring Boot 3.2.5 (Spring MVC, Spring Data JPA, Hibernate ORM)
* **Database:** MySQL 8.0 with HikariCP Connection Pooling
* **Frontend:** Semantic HTML5, Modern CSS3 (Flexbox/Grid), Vanilla JavaScript (ES6+ Fetch API)
* **Build Tool:** Apache Maven 3.9+
* **Icons & Fonts:** FontAwesome 6.5.1, Google Fonts (Cinzel, Plus Jakarta Sans)

## 🔑 Key Features
* **Role-Based Access Control (RBAC):**
  * `ROLE_ADMIN` (Club President): Full access to confidential member dossiers (contacts, emails, classifications) and inline member registration/charter form.
  * `ROLE_MEMBER`: Read-only access to fellowship schedules and public rosters.
* **Authentication Engine:** Secure REST endpoint (`/api/auth/login`) with credential verification and session management via browser local storage.
* **Responsive Institutional UI:** Light-themed civic interface featuring high-res imagery, Four-Way Test grid, and dynamic quote showcases.
* **MySQL Persistence:** Relational schema enforcing unique indexes and transactional integrity across all entities.

## 🛠️ Getting Started

### Prerequisites
* JDK 17 LTS installed
* MySQL 8.0 running locally on port 3306

### Database Setup
```sql
CREATE DATABASE rotary_club_db;
Update your database credentials in src/main/resources/application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/rotary_club_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=your_password
Build and Run
Bash
# Clone the repository
git clone [https://github.com/Santhosh-Subramani22/Rotary-Club-Management-System.git](https://github.com/Santhosh-Subramani22/Rotary-Club-Management-System.git)
cd Rotary-Club-Management-System

# Run with Maven
mvn spring-boot:run
Access the application in your browser at:
http://localhost:8080

👤 Default Demo Credentials
Club President: admin@rotary.org / admin123 (Admin privileges)

Club Member: member@rotary.org / member123 (Member privileges)

Developed as an engineering mini-project.
