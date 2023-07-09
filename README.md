# My Java Application

This repository contains a Java application that performs user information and secret information operations.

## Prerequisites

- Java Development Kit (JDK) installed
- Integrated Development Environment (IDE) of your choice (e.g., IntelliJ IDEA, Eclipse)

## Getting Started

1. Clone this repository to your local machine or download the source code.
2. Open the project in your preferred IDE.

## Usage

1. Run the `Main` class to start the application.
2. The application will prompt you to enter user information, including username, password, and email.
3. The user information will be saved to the `person.txt` file located at `c:\\io\\turgutozaluniversitesi\\person.txt`.
4. Then, you will be prompted to enter secret information.
5. The secret information will be saved to the `secret.txt` file located at `c:\\io\\turgutozaluniversitesi\\secret.txt`.
6. The application uses multithreading to save user information and secret information concurrently.
7. Once the threads complete, the application will display a completion message.

## File Locations

- `person.txt`: The file that stores the user information.
- `secret.txt`: The file that stores the secret information.

## Note

Please make sure you have the necessary write permissions for the file locations mentioned above. If you encounter any issues related to file permissions, adjust the file locations or permissions accordingly.
