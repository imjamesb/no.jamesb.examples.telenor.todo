# Todo App

This is a simple todo app that was made as an example to showcase a Java
project.

As far as I have been able to search myself, I understand that Telenor uses Java
and Springboot, so that is what I will use for this project. I will setup the
project using Maven as a dependency manager and build tool. During my research I
found that Telenor uses SOAP and RESTful APIs, for the purpose of this project I
will create a RESTful API.

## Features

- Formatted and linted Java code, checked on GitHub Actions before deployment.
- Tests that cover all non-thirdparty code.
- Automatic deployment via GitHub Actions, only if tests pass.
- Sign in with GitHub using the OAuth2 / OpenID specifications.
- Authentication using JSON Web Tokens.
- Persistency using a PostgreSQL database.
- Each account get their own Todo-list.
- Add a todo item.
- Mark a todo item as `doing` or `done`.
- Backmark a todo item as `unresolved` or `doing`.
- Archive a single todo item, or archive all todo items marked as `done`.

## Features that could make the application better

- Allow users to create their own named lists bound to their account.
- Invite other users to edit an owned list, to for example: **Public (Anyone
  with the link)** or **Invite only**.
- Change visibility of list to for example: **Public (Anyone with the link)**,
  **Private** or **Password protected**.

## Research articles

A list of research articles that was used to prepare and create this project.

- [Formatting, linting, and code analysis for Java in Visual Studio Code](https://code.visualstudio.com/docs/java/java-linting)
  (2022-11-29 21:38) - This has been used to learn how to format and lint the
  code written in [Visual Studio Code](https://code.visualstudio.com).

## Todos

- [ ] Set up Editor for Java development.
- [ ] Set up a development container so it is unnecessary to install Java to
      work on the project.
- [ ] Print Hello World and make it run.
- [ ] Add linter and formatter.
- [ ] Add CI to check linting and formatting.
- [ ] Add a function that returns `Hello {name}`.
- [ ] Add a test to test the new function.
- [ ] Add a CI step to test the code.
- [ ] Add a deployment step that runs only on main branch and when all other CI
      steps have succeeded.
- [ ] Configure the project for Springboot.
- [ ] Add a HTTP route for `GET /:name` which responds with plain text,
      `hello {name}`.
- [ ] Configure the deployment for a web server.
- [ ] Ensure that the deployment works.
- [ ] Create a test for the endpoint.
- [ ] Set up a local postgres development database.
- [ ] Set up a postgres database connection in the code.
- [ ] Write a function that writes to, and one that reads from the datbase.
- [ ] Test the code.
- [ ] Setup a postgres test database for the CI.
- [ ] Create a production postgres database.
- [ ] Double check that the production postgres database works.
- [ ] Pass final CI/CD before writing code specific to the Todo app.
- [ ] Create a database architecture for the todo app.
- [ ] Create the first database migration to setup the database, and one to undo
      the migration.
