Engetower Application

This project consists of a frontend application built with Angular and a backend API developed using Java Spring Boot with an H2 in-memory database.
Stack Used

    Frontend: Angular 18.0.5
    Backend: Java Spring Boot
    Database: H2 (in-memory)

Functionality

The application allows users to manage a list of users, including adding new users, listing all users, and deleting users.
Frontend (Angular)

The frontend provides the following functionalities:

    Add User: Enter a name and email for a new user and click "Add User" to add them to the list dynamically.
    List Users: Displays all users fetched from the backend.
    Delete User: Allows deletion of a user from the list by clicking the "Delete" button next to each user.

Backend (Java Spring Boot)

The backend API supports the following endpoints:

    GET /api/users: Retrieves a list of all users.
    POST /api/users: Adds a new user to the database.
    DELETE /api/users/{id}: Deletes the user with the specified ID from the database.

How to Run
Prerequisites

    Node.js and npm installed
    Java 11 or higher installed
    Maven installed

Frontend (Angular)

    Navigate to the frontend directory:

    bash

cd angular-frontend

Install dependencies:

bash

npm install

Run the frontend:

bash

    ng serve

    Access the application:
    Open a browser and navigate to http://localhost:4200.

Backend (Java Spring Boot)

    Run the backend:

    bash

    ./mvnw spring-boot:run

    This command will compile the backend and start the Spring Boot application.

    Access the API:
        The API endpoints are accessible at http://localhost:8080/api/users.

Running Tests
Frontend Tests (Angular)

    Run unit tests for the frontend:

    bash

    ng test

Backend Tests (Java Spring Boot)

    Run tests for the backend using Maven:

    bash

    ./mvnw test

Running Tests

To run the UserControllerTest directly, use the following command:

    bash

    ./mvnw test -Dtest=com.raposo.engetower.UserControllerTest

Ignoring No Tests Error

If you encounter an error about no tests being executed, you can add the -DfailIfNoTests=false flag to ignore it:

    bash

    ./mvnw test -Dtest=com.raposo.engetower.UserControllerTest -DfailIfNoTests=false

