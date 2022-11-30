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

## Todos

- [x] Set up Editor for Java development.
- [x] Set up a development container so it is unnecessary to install Java to
  work on the project.
- [x] Print Hello World and make it run.
- [x] Add linter and formatter.
- [x] Add CI to check linting and formatting.
- [x] Configure the project for Springboot.
- [x] Add a HTTP route for `GET /:name` which responds with plain text,
  `hello {name}`.
- [x] Add a test for `GET /:name`.
- [x] Define a database structure for the todo application.
- [x] Create a docker-compose for local development.
- [x] Create a postgres database in the docker-compose file for local development.
- [ ] Use Spring ORM to recreate tha database structure in Java.
