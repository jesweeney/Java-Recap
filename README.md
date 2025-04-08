# Java-Recap
As I continue my understanding of Java I want to recap on beginner basics. 


# Not Your First Program (Setting up IDE)
1. Implement IsOdd and test it in main.
2. Implement IsPrime.


# Built in Data Types
1. Write a program that outputs a random roll of 2 six-sided dice.

2. Write a program that takes in the x and y coordinates of a point (via command-line args) and outputs the distance of the point from the origin.
You can use the distance formula d= sqrt(x^2+y^2)

3. Write a program that outputs the values of x that satisfy the quadratic equation ax2+bx+c=0.
The program should take as input three command-line arguments denoting a,b,c. 
The program can use the quadratic formula 

4. Write a program that outputs whether an integer corresponds to a leap year.

  A non-century year is a leap year if it is divisible by 4. A century year is a leap year if it is divisible by 400.

5. Write a program that calculates and prints the amount of money you would have after t years if you invested P dollars at an annual interest rate r (compounded continuously).
   You can use the formula Pe^(rt).


# Control Flow
1. Write a program that outputs the result of a random coin toss.


# Loops

1. Compute the finite sum 1+2+...+n
  
3. Compute the largest power of 2 less than or equal to n
   
5. Compute amount of money you would have after t years if you invested P dollars at an annual interest rate r (compounded annually).


# Functions
1. Write a static method max3() that takes three int arguments and returns the value of the largest one. Add an overloaded function that does the same thing with three double values.

2. Write a static method odd() that takes three boolean arguments and returns true if an odd number of the argument values are true, and false otherwise.

3. Write a static method majority() that takes three boolean arguments and returns true if at least two of the argument values are true, and false otherwise. Do not use an if statement.

4. Write a static method eq() that takes two int arrays as arguments and returns true if the arrays have the same length and all corresponding pairs of of elements are equal, and false otherwise.


# Arrays
1. Reverse the order of the elements in an array (without creating another array).
   This was finished in ReverseOrderArray.java.

2. Create a multiplication table up to 9 times 9. Specifically, populate a 2D array such that its [m][n] entry is the value of m×n.

3. Determine whether a String is a palindrome (same backward and forward e.g. "kayak")

4. Randomly shuffle the elements of an array (inline).

5. Simulate the "Birthday Paradox".

  Keep generating a random number between 1 and 365 (both inclusive) until there's a duplicate. Output the number of random numbers generated. This simulates the number of people who need to enter a room until two of them have the same birthday.

  Repeate the simulation many times to find the average number of people required to have a "birthday collision". How does the average relate to the number of days in a year?
