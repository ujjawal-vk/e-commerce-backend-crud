# 🛒 E-Commerce Backend (CRUD) - Java Spring Boot

This is a simple backend API for an eCommerce application built using **Java Spring Boot**. It supports basic **CRUD operations** (Create, Read, Update, Delete) for products and users, serving as the foundation for a complete eCommerce system.

---

## 🚀 Features

- Create, read, update, and delete operations for:
  - Products
- RESTful API architecture
- Spring Boot + JPA + H2 (configurable)

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot
- **Database**: H2 (in-memory) 
- **ORM**: Spring Data JPA
- **Build Tool**: Maven
- **API Tool**: Postman (for testing)

---

📬 API Endpoints
| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| GET    | /products      | Get all products  |
| GET    | /products/{id} | Get product by ID |
| POST   | /products      | Create product    |
| PUT    | /products/{id} | Update product    |
| DELETE | /products/{id} | Delete product    |

---

📦 Future Enhancements
JWT-based authentication

Role-based access control

Orders & Cart modules

Admin dashboard

Integration with frontend
