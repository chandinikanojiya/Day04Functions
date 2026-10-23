# Kotlin Functions Basics 🚀

This repository is a beginner-friendly guide and practical implementation of **Functions in Kotlin**. It covers everything from basic function declarations to more advanced concepts like return types and parameters.

## 📌 Concepts Covered

- **Declaring & Calling Functions:** Understanding the `fun` keyword and how the Kotlin compiler uses the `main()` function as a starting point.
- **Code Reusability & Readability:** Structuring code into smaller, single-task functions instead of cluttering the `main()` block.
- **Return Types:** How to use the `return` keyword to pass data back from a function (and understanding the implicit `Unit` type).
- **Parameters vs. Arguments:** Passing dynamic data into functions using parameters and string templates (`$variable`).

## 🛠️ Code Example

Here is a quick look at how dynamic functions with parameters and return types are implemented in this project:

```kotlin
// Function with a parameter and String return type
fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, \$name!"
    val ageGreeting = "You are now 5 years old!"
    return "\(nameGreeting\n\)ageGreeting"
}

fun main() {
    // Calling the function with different arguments
    println(birthdayGreeting("Rover"))
    println(birthdayGreeting("Rex"))
}
```

## 🚀 How to Run
1. Clone this repository.
2. Open the project in **IntelliJ IDEA** or use the **Kotlin Playground**.
3. Run the `main()` function to see the output.
