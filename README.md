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
