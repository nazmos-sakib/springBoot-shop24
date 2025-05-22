# springBoot-shop24
# Online Bookstore – Spring Boot (MVC)

A university project developed as part of my **Master's degree program**, demonstrating a basic online bookstore using **Spring Boot** and **Java** with strict adherence to the **MVC design pattern**. The application allows admins to manage books and authors, while users can browse and add books to a cart.

## Features
- **Admin Operations** (`AdminController`)
  - Add, view, and manage books and authors in the database
- **User Interface** (`IndexController`)
  - Browse available books and general website pages
- **Shopping Cart** (`ShopController`)
  - View products, add/remove items from the cart

## Technical Implementation
- **Backend**: Spring Boot (Java) with MVC architecture
- **Frontend**: FreeMarker (`.ftlh` templates) for server-side rendering
- **Package Structure**: `de.hsm`
  - **Controllers**:
    - `AdminController`: Handles book/author management
    - `IndexController`: Manages general pages
    - `ShopController`: Handles product display and cart logic
  - **Models/Repositories**: Entities for `Book`, `Author`, and `Cart`

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/online-bookstore.git
   ```

# Note
This project was developed as a course requirement for my Master's program, focusing on Spring Boot fundamentals and MVC design.
