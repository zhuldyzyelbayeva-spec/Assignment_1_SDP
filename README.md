# Porridge Builder Pattern Assignment

Console application demonstrating the **Builder** creational design pattern in Java (JDK 17) for Astana IT University Software Design Patterns course[cite: 1].

## Domain
A custom Porridge configuration system. It utilizes a static nested Builder class with a Fluent API to step-by-step assemble a bowl of porridge with optional ingredients (grains, liquids, butter, fruits, and nuts/seeds).

## How to Run
1. Open the project in **IntelliJ IDEA**.
2. Ensure Project SDK is set to **Java 17**.
3. Run the `Main.java` file located in `src/main/java/software/assignment_sdp/Main.java`.

## Project Structure
- `Porridge.java`: The complex product class containing a static nested `Builder` class.
- `Main.java`: Client application demonstrating fluent API method chaining.
