```markdown
# Java Console Calculator

A simple console-based calculator application built in Java.  
It allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

## ✨ Features

- Interactive console interface
- Supports the following operations:
  - Addition (`+`)
  - Subtraction (`-`)
  - Multiplication (`*`)
  - Division (`/`)
- Handles invalid operators
- Prevents division by zero
- Allows the user to perform multiple calculations until they choose to exit

## 📂 Project Structure

```

📦 CalculatorApp

┣ 📜 Main.java

┣ 📜 Calculator.java


- `Main.java` – Contains the entry point of the program and handles user interaction.
- `Calculator.java` – Contains the logic for arithmetic operations.

## ▶️ How to Run

1. Make sure you have Java installed (version 8 or higher).
2. Compile the Java files:

````
javac Main.java Calculator.java
````

3. Run the program:

```bash
java Main
```

## 📌 Usage

Once the program is running, follow the prompts:

1. Enter the first number.
2. Enter the second number.
3. Choose an operator (`+`, `-`, `*`, `/`).
4. View the result.
5. Decide whether to perform another calculation.

### Example

```
Welcome to Calculator
Please, type the first number:
> 10
Please, type the second number:
> 5
Please, choose the operator: (+ , - , * , / )
> *
The result between: 10.0 * 5.0 is: 50.0
Do you want to continue calculating? (yes/no):
> no
Thanks for using calculator!
```

## ⚠️ Notes

* If you try to divide by zero, the program will throw an error.
* Invalid operators are not accepted and will prompt the user to choose again.

## 🛠️ Technologies

* Java (Standard Edition)
* Console I/O (`Scanner` class)

## 🧑‍💻 Author

Developed by Pedro Henrique Oliveira 💜

---

Feel free to customize or expand this calculator with more features in the future!