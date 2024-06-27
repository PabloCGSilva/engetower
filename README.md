# Engetower Application

This project is a web application built with Angular and Spring Boot.

## Stack Used

- **Frontend**: Angular 18.0.5
- **Backend**: Java with Spring Boot
- **Database**: H2 Database (in-memory)

## Functionalities

The application allows users to:
- Add new users with their name and email.
- Display a list of all users fetched from the backend.
- Delete users from the list and backend.

## How to Run

### Prerequisites

Before running the application, make sure you have the following installed:
- Java Development Kit (JDK) 11 or higher
- Node.js with npm (Node Package Manager)

### Backend (Spring Boot)

1. Navigate to the backend directory:
   ```bash
   cd backend
Build the Spring Boot application:

bash

./mvnw clean install

Run the application:

bash

    ./mvnw spring-boot:run

    The backend server will start at http://localhost:8080.

Frontend (Angular)

    Navigate to the frontend directory:

    bash

cd frontend

Install dependencies:

bash

npm install

Start the Angular development server:

bash

    npm start

    The frontend server will start at http://localhost:4200.

Running Tests
Backend (Spring Boot)

To run backend tests, use Maven:

bash

./mvnw test

Frontend (Angular)

To run frontend tests, use Angular CLI:

bash

npm test

Contributing

    Fork the repository and clone it locally.
    Create a new branch for your feature or bug fix:

    bash

git checkout -b feature/new-feature

Make your changes and test thoroughly.
Commit your changes:

bash

git commit -am 'Add new feature'

Push to the branch:

bash

    git push origin feature/new-feature

    Submit a pull request.

License

This project is licensed under the MIT License - see the LICENSE file for details.

perl


#### 3. Save and Exit

Save your changes to the `README.md` file and exit the text editor.

#### 4. Commit and Push to GitHub

After saving your `README.md` file, commit it to your local repository and push it to your GitHub repository:

```bash
git add README.md
git commit -m "Add README.md with setup instructions"
git push origin master
