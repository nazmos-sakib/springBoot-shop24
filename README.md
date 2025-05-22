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

## Project Structure

```
src/  
├── main/  
│   ├── java/  
│   │   └── de/hsm/  
│   │       ├── controller/      # Handles HTTP requests  
│   │       ├── model/           # Entities (Book, Author, Cart) 
│   │       └── Shop24Application.java # Main class  
│   └── resources/  
│       ├── templates/           # .ftlh view files  
│       ├── static/imagess            
│       └── application.properties  

```


## How to Run

### Prerequisites
- Java 17 or later
- Maven 3.6.3 or later

### Running the Application

#### Option 1: Using IDE (Recommended)
1. **Import as Maven Project**:
   - IntelliJ/Eclipse: Select `File → Open` and choose the `pom.xml` file
2. **Build the project**:
   - Let IDE resolve Maven dependencies automatically
3. **Run**:
   - Locate `Shop24Application.java` in `de.hsm` package
   - Right-click → `Run 'Shop24Application'`

#### Option 2: Command Line  
1. Clone the repository:
   ```bash
   git clone https://github.com/nazmos-sakib/springBoot-shop24.git
   cd springBoot-shop24
   ```
2. Build and run:
   ```bash
   mvn spring-boot:run
   ```
3. Access the app at: ```http://localhost:8080```

# Note
This project was developed as a course requirement for my Master's program, focusing on Spring Boot fundamentals and MVC design.
