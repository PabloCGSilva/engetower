Angular Frontend Project: engetower
Overview

This project is an Angular frontend application for managing user data. It integrates with a backend API for user CRUD operations.
Stack Used

    Angular: Frontend framework
    Bootstrap: CSS framework for styling

Functionality

    Add User: Allows adding new users with a name and email.
    List Users: Displays a list of all users fetched from the backend.
    Delete User: Removes a user from the list and deletes it from the backend.

How to Run

    Prerequisites:
        Node.js and npm installed on your machine.
        Angular CLI (npm install -g @angular/cli).

    Clone the Repository:

    bash

git clone <repository_url>
cd angular-frontend

Install Dependencies:

bash

npm install

Run the Application:

bash

    ng serve

    Navigate to http://localhost:4200/ in your browser.

How to Run Tests

    Unit Tests:

    bash

    ng test

Project Structure

sql

angular-frontend/
├── src/
│   ├── app/
│   │   ├── user.ts
│   │   ├── user-list/
│   │   │   ├── user-list.component.ts
│   │   │   ├── user-list.component.html
│   │   │   └── user-list.component.css
│   │   ├── user-form/
│   │   │   ├── user-form.component.ts
│   │   │   ├── user-form.component.html
│   │   │   └── user-form.component.css
│   │   ├── user.service.ts
│   │   ├── app.component.ts
│   │   ├── app.component.html
│   │   └── app.module.ts
│   ├── assets/
│   ├── environments/
│   ├── index.html
│   └── ...
├── node_modules/
├── angular.json
├── package.json
└── README.md

Additional Notes

    Ensure the backend API endpoints are correctly configured in user.service.ts.
    Modify environment variables in environments/environment.ts for different environments.
