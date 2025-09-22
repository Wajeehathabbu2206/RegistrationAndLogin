# 🚀 Registration & Login Form Web Application

## Overview

This is a simple web-based application built using Spring Boot, Spring Data JPA, MySQL, Thymeleaf, HTML, and CSS. It allows users to register and login securely. User data is stored in a MySQL database, and the application demonstrates session management, form validation, and CRUD operations for user accounts.

## ✅ Key Features

- 🔐 **User Registration** – Users can create an account with a username, email, and password. 
- 🔑 **User Login** – Users can log in using their registered credentials
- 💾 **Database Integration** – MySQL stores user data  
- 🌐 **Responsive UI** – Built with HTML, CSS, and Thymeleaf templates.
- ⚠️ **Basic Form Validation** – Ensures valid input for registration and login forms.  
- ⚡ **Session Management** – Prevents unauthorized access to protected pages.

---

## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA
- **Database**: MySQL
- **Frontend** HTML, CSS, Thymeleaf
- **Build Tool**: Maven
- **IDE**: Spring Tool Suite

## ⚡ Setup Instructions

1️⃣ Clone the repository:

   ```git clone <repository-url>```

2️⃣ Configure MySQL database:

1.Create a database named registration_db.
2.Update application.properties with your MySQL credentials:
  
```spring.datasource.url=jdbc:mysql://localhost:3306/registration_db```
```spring.datasource.username=root``` <br>
```spring.datasource.password=yourpassword``` <br>
```spring.jpa.hibernate.ddl-auto=update ```

3️⃣ Run the application:

``` mvn spring-boot:run```

4️⃣ Access the app: Open http://localhost:8080 in your browser.

## Project Structure

```src/main/java
 └─ com.example.registration
     ├─ controller
     ├─ entity
     ├─ repository
     └─ service
src/main/resources
 ├─ templates (Thymeleaf HTML pages)
 └─ static (CSS and JS files)
```

### Author

Wajeeha Thabassum 



