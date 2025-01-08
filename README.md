# LeetCode 1672: Richest Customer Wealth

## Author
Samridhi Gupta

## Date
08/01/2025

## Problem Statement
The program calculates the maximum wealth among customers based on their bank account balances. Each customer has multiple bank accounts, and the wealth is defined as the sum of all accounts for that customer.

## Description
The `LeetCode1672` program is a Java application that prompts the user to input the account balances for 5 customers, each having 5 accounts. It then computes and displays the maximum wealth among these customers.

## Features
- Accepts user input for 5 customers, each with 5 bank accounts.
- Calculates the maximum wealth among the customers.
- Outputs the result clearly.

## How to Run the Program

### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Steps
1. **Clone the Repository** 
2. **Compile the Program**:
   Open a terminal and navigate to the directory containing the `LeetCode1672.java` file. Then run:
   ```bash
   javac LeetCode1672.java
   ```

3. **Run the Program**:
   Execute the compiled Java program using:
   ```bash
   java LeetCode1672
   ```

4. **Input**:
   - The program will prompt you to enter the account balances for 5 customers (5 integers for each customer).

5. **Output**:
   The program will display the maximum wealth found among the customers.

## Example

### Input:
```
Enter account balances for 5 customers (5 accounts each):
1 2 3 4 5
5 6 7 8 9
1 1 1 1 1
0 0 0 0 0
2 2 2 2 2
```

### Output:
```
Maximum wealth: 45
```

## Code Explanation

- The program begins by importing the `Scanner` class for user input.
- It defines the `LeetCode1672` class, which contains the `main` method and the `maximumWealth` method.
- The `main` method handles user input and calls the `maximumWealth` method.
- The `maximumWealth` method iterates through the array to calculate the sum of each customer's accounts and tracks the maximum wealth found.

## Conclusion
This program effectively demonstrates how to calculate the maximum wealth among customers based on their account balances, showcasing basic Java programming concepts such as arrays, loops, and user input.
