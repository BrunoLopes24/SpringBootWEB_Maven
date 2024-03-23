# Spring Boot Web Project

## Overview

This project is a Spring Boot application designed for managing orders, products, and categories. It uses Spring Data JPA for data persistence and provides a RESTful API to interact with the application. 

## Features

- CRUD operations for users, orders, products, and categories.
- Order management with status tracking (Paid, Canceled, Waiting Payment).
- Product categorization.
- Payment processing for orders.

## Technologies

- Spring Boot: Framework for creating stand-alone, production-grade Spring based Applications.
- Spring Data JPA: For data persistence and CRUD operations.
- H2 Database: In-memory database for testing.
- Maven: For dependency management and project build.
- Jackson: For JSON parsing and response handling.

## Project Structure

- `src/main/java/com/mycompany/SrpingBootWeb_maven/entities/`: Domain models such as User, Order, Product, Category, etc.
- `src/main/java/com/mycompany/SrpingBootWeb_maven/repositories/`: Spring Data repositories for CRUD operations.
- `src/main/java/com/mycompany/SrpingBootWeb_maven/services/`: Service layer for business logic.
- `src/main/java/com/mycompany/SrpingBootWeb_maven/resources/`: REST controllers for handling API requests.
- `src/main/java/com/mycompany/SrpingBootWeb_maven/config/`: Configuration classes, including the test configuration setup.
- `src/main/java/com/mycompany/SrpingBootWeb_maven/resources/exceptions/`: Exception handling for the resources layer.

## API Endpoints

### Categories
- GET /categories: List all categories.
- GET /categories/{id}: Get a specific category by its ID.

### Orders
- GET /orders: List all orders.
- GET /orders/{id}: Get a specific order by its ID.
