Here's an improved version of your README:

**Engetower Application**

Engetower is a user management application built with Angular for the frontend and Java Spring Boot with an in-memory H2 database for the backend.

**Technologies**

* Frontend: Angular 18.0.5
* Backend: Java Spring Boot
* Database: H2 (in-memory)

**Features**

* Add new users
* List all users
* Delete users

**User Interface (Angular)**

The user interface allows you to:

* **Add User:** Enter a name and email for a new user and click "Add User" to add them to the list.
* **List Users:** View a list of all users retrieved from the backend.
* **Delete User:** Delete a user by clicking the "Delete" button next to their name.

**API (Java Spring Boot)**

The backend API provides these endpoints:

* `GET /api/users`: Retrieves a list of all users.
* `POST /api/users`: Adds a new user to the database.
* `DELETE /api/users/{id}`: Deletes the user with the specified ID from the database.

**Getting Started**

**Prerequisites:**

* Node.js and npm installed
* Java 11 or higher installed
* Maven installed

**Running the Application**

1. **Clone the repository** (if not already done)
2. **Navigate to the project directory**
3. **Run the backend:**

   ```bash
   ./mvnw spring-boot:run
   ```

4. **In a separate terminal, navigate to the frontend directory:**

   ```bash
   cd angular-frontend
   ```

5. **Install frontend dependencies:**

   ```bash
   npm install
   ```

6. **Run the frontend:**

   ```bash
   ng serve
   ```

**Accessing the Application**

* **Frontend:** http://localhost:4200
* **Backend API:** http://localhost:8080/api/users

**Running Tests**

**Frontend Tests (Angular):**

```bash
ng test
```

**Backend Tests (Java Spring Boot):**

```bash
./mvnw test
```

**Running a Specific Test:**

To run a specific test class (e.g., `UserControllerTest`), use:

```bash
./mvnw test -Dtest=com.raposo.engetower.UserControllerTest
```

**Ignoring "No Tests" Error:**

If you encounter an error about no tests being found, you can ignore it with the following command:

```bash
./mvnw test -Dtest=com.raposo.engetower.UserControllerTest -DfailIfNoTests=false
```
