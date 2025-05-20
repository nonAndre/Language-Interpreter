# 🧠 Language-Interpreter

A  **Simple language interpreter** built in **Java** using **ANTLR4**.

## 🔧 Setup Instructions

1. **Add the ANTLR Runtime Library**  
   Download and add `antlr4-runtime-4.13.2.jar` to your project dependencies.  
   You can get it from the official ANTLR website.
 
   **Add the Commons- Library**
   Download and add both `commons-lang3-3.9.jar` and `commons-text-1.8.jar` to your project dependencies.

3. **Provide a Source File**  
   The program expects a file named `prog` as an argument. This file should contain the code to interpret.

## 🛠 Running in IntelliJ IDEA

To pass the `prog` file as an argument:

- Right-click on the `main` method  
- Go to `More Run/Debug` → `Modify Run Configuration`  
- In the **Program Arguments** section (second line), type:  prog

# Language Specification

This language supports the following features:

1. **Basic Operations**  
   Arithmetic operators: `+`, `-`, `/`, `*`, `%`, `^`, etc.

2. **Non-Determinism**  
   Example: {print(42)}ND[{print(67)}ND[print(420)]]
   
3. **Loops**  
   `while` loops  
    for` loops

4. **Conditional Statements**  
   Support if-then-else`

5. **Input/Output Functions**  
   `print`  
   `input`

6. **Data Types**  
   Strings (Recommendation: provide a function to convert floats to strings)  
   Floats  
   Arrays

7. **Variables**

8. **Functions**

9. **Brainfuck Integration**  
   The command `sly{...}arnold` allows embedding any Brainfuck program inside your code.  
   The interpreter must be able to execute these Brainfuck programs seamlessly.  
   Recommended Brainfuck interpreter for testing: [https://copy.sh/brainfuck/](https://copy.sh/brainfuck/)

---

Feel free to extend this specification as you develop the language!

