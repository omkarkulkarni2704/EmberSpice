# 🍽️ EmberSpice – Smart Restaurant Management Platform

### **A premium restaurant management web platform to browse menu items, place food orders, reserve tables, track order status, and manage the complete restaurant workflow.**

EmberSpice is a restaurant management application that helps customers browse dishes, add food to cart, place orders, reserve tables, and track order progress. The platform also includes an admin dashboard to manage food orders, bookings, and delivery updates.

---

## 🎥 Project Demo

[Watch Demo Video](Add Your Demo Link Here)

---

## 🌟 Key Features

### 👤 For Customers:

* **Restaurant Landing Page**: Premium home page with featured dishes, offers, and customer reviews.
* **Dynamic Food Menu**: Browse multiple food items with images, price, and category.
* **Food Selection and Cart**: Select dishes and add them directly to cart.
* **Table Booking System**: Reserve a table by entering name, mobile number, date, time, and number of guests.
* **Order Placement Workflow**: Place food orders from the cart page.
* **Order Tracking**: Track order status such as Pending, Preparing, and Delivered.
* **Customer Reviews and Ratings**: Submit ratings and comments directly from the website.

### 🏪 For Restaurant Admin:

* **Admin Dashboard**: View all customer orders and table bookings.
* **Live Order Status Management**: Update order status from Pending → Preparing → Delivered.
* **Booking Monitoring**: Track all table reservations.
* **Restaurant Workflow Management**: Manage the complete restaurant process from order placement to delivery.

---

## 🛠️ Technologies Used

### 1. Backend:

* **Java 25**: Core backend logic and restaurant workflow implementation.
* **Spring Boot**: Application framework and backend server.
* **Spring MVC**: Handles routing and request processing.
* **Spring Data JPA**: ORM layer for managing menu items, orders, bookings, and reviews.
* **Maven**: Dependency management and project build tool.

### 2. Frontend:

* **HTML, CSS, Thymeleaf**: Dynamic restaurant UI with server-side rendering.
* **Custom CSS**: Premium dark-themed restaurant interface.

### 3. Database:

* **MySQL**: Stores menu items, customer orders, table bookings, and customer reviews.

---

## 🧭 System Architecture

                    ┌────────────────────────────┐
                    │        End Users           │
                    │ Customers / Restaurant     │
                    │        Web Browser         │
                    └─────────────┬──────────────┘
                                  │
                         HTTP Requests / Forms
                                  │
                    ┌─────────────▼──────────────┐
                    │      Spring Boot App       │
                    ├────────────────────────────┤
                    │ Controllers                │
                    │ - HomeController           │
                    │ - MenuController           │
                    │ - CartController           │
                    │ - BookingController        │
                    │ - AdminController          │
                    │                            │
                    │ Features                   │
                    │ - Menu Management          │
                    │ - Table Booking            │
                    │ - Cart and Orders          │
                    │ - Review System            │
                    └─────────────┬──────────────┘
                                  │
                        Hibernate ORM / JDBC
                                  │
                    ┌─────────────▼──────────────┐
                    │       MySQL Database       │
                    │                            │
                    │ Stores:                    │
                    │ - Menu Items               │
                    │ - Orders                   │
                    │ - Bookings                 │
                    │ - Reviews                  │
                    └────────────────────────────┘

---

## 📋 Application Workflow

* Customer opens restaurant website
* Customer browses food menu
* Customer selects dishes and adds them to cart
* Customer places order or books a table
* Order is stored in database
* Admin views the order in dashboard
* Admin updates status to Preparing / Delivered
* Customer tracks order status from My Orders page
* Customer can submit rating and review

---

## 📝 Current Features Implemented

* Restaurant home page with premium design
* Dynamic menu with food images and pricing
* Food selection and cart system
* Table booking functionality
* Order placement and order tracking
* Admin dashboard with order status update
* Customer reviews and ratings
* Navigation between Home, Menu, Cart, Orders, and Booking pages

---

## 📷 Screenshots

* Home Page
* Menu Page
* Cart and Order Page
* Table Booking Page
* Admin Dashboard
* Customer Reviews Section

---

## 🤝 Contributing

### Contributions are welcome.

* Fork the repository
* Create a new branch
* Make your changes
* Submit a pull request

---

## 💬 Contact
* Developer: [Omkar Kulkarni](https://www.linkedin.com/in/omkarkulkarni-dev/)
  
---
