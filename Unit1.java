🔷 1.Introduction to Java

- Java is a high-level,platform-independent,object-oriented programming language developed by Sun Microsystems (now owned by Oracle).
- Java code is compiled into bytecode which runs on the Java Virtual Machine (JVM).

 🔹 Features of Java (Important PYQ!)

1. Simple
2. Object-Oriented
3. Platform Independent
4. Secure
5. Robust
6. Multithreaded
7. High Performance
8. Distributed
9. Dynamic



 🔷 2. Difference between Java and C/C++ (PYQ)

| Feature              | C/C++              | Java                          |
| -------------------- | ------------------ | ----------------------------- |
| Platform             | Platform dependent | Platform independent (JVM)    |
| Pointers             | Supports pointers  | No direct pointer             |
| Memory Mgmt          | Manual             | Automatic (Garbage Collector) |
| Multiple Inheritance | Yes (via classes)  | No (uses Interfaces)          |
| Compilation          | .exe file          | Bytecode (.class file)        |


 🔷 3. Java Data Types & Variables

int x = 10;
float y = 10.5f;
char c = 'A';
boolean b = true;

Primitive Types: int, float, double, boolean, char, byte, short, long
  
 🔷 4. Operators in Jav

* Arithmetic: + - \* / %
* Logical: && || !
* Relational: > < == != >= <=
* Assignment: = += -= etc.

 🔷 5. Control Structures

if (a > b) {
    System.out.println("A is greater");
} else {
    System.out.println("B is greater");
}

switch(day) {
    case 1: System.out.println("Monday"); break;
    default: System.out.println("Invalid");
}

for (int i=0; i<5; i++) {
    System.out.println(i);
}


🔷 6.Type Casting in Java

int a = 10;
double b = a; // implicit

double c = 10.5;
int d = (int)c; // explicit


🔷 7.Input in Java

import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();

🔷 8.Arrays in Java
  
int[] arr = new int[5];
arr[0] = 10;
System.out.println(arr[0]);


 🔷 9.Command Line Arguments

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}

 ✅ 13. Exception Handling in Java (Basics)
👉 Definition:
Exception handling is a mechanism to handle runtime errors and ensure the normal flow of the program.
  Instead of crashing, the program shows a proper message or takes alternate action.

🔹What is an Exception?

An exception is an event that occurs during the execution of a program and disrupts the normal flow.
  (e.g., dividing by zero, accessing invalid array index).


 🔹 Why Exception Handling?

* To handle runtime errors gracefully
* To avoid program crashes
* To maintain normal program flow

 🔸Keywords Used in Exception Handling

1.try block

Used to write the code that might cause an exception.
Syntax:
try {
   // risky code here
}
2.catch block

Used to catch and handle the exception thrown by the try block.
Syntax:
catch(ExceptionType e) {
   // handling code
}


✅ Example:
try {
   int a = 5 / 0; // risky
} catch (ArithmeticException e) {
   System.out.println("Error: Division by zero");
}
 3.finally block

This block always executes (whether an exception occurs or not). It is used to clean up resources like closing files, or database connections.
Syntax:
finally {
   // cleanup code
}

✅ Example:
try {
   int a = 10 / 2;
} catch (Exception e) {
   System.out.println("Error");
} finally {
   System.out.println("This block always runs");
}

 4.throw keyword

Used to manually throw an exception.
Syntax:
throw new ExceptionType("error message");


✅Example:

throw new ArithmeticException("Manual error");
5. throws keyword

Used in method definition to declare that a method might throw an exception.
Syntax:
void myMethod() throws IOException {
   // code that might throw IOException
}

✅ Example:


public static void main(String[] args) throws InterruptedException {
   Thread.sleep(1000);
}

 🔸 Common Java Exceptions

| Exception                      | Description                          |
| ------------------------------ | ------------------------------------ |
| ArithmeticException            | Division by zero                     |
| NullPointerException           | Accessing object with null reference |
| ArrayIndexOutOfBoundsException | Invalid array index                  |
| NumberFormatException          | Converting invalid string to number  |
| IOException                    | Input-output operation failure       |


------------------------------------------------------------------
✅ 📑 PYQs from Java Unit 1 (AKTU)

🔶 Q1. Write a Java program to accept a number from user and check whether it is even or odd.

[PYQ - 2021, 2019]

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
 🔶 Q2. Write a program in Java to print sum of all elements in array.

[PYQ - 2022]

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}

 🔶 Q3. Write a Java program to display multiplication table of any number.

[PYQ - 2022]


import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
🔸 Q4. Write a Java program to check whether a number is Prime or Not.

[PYQ – 2021, 2019]

import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
}

 🔸 Q5. Write a Java program to find factorial of a number.
[PYQ – 2018, 2020]

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}

🔸Q6. Write a Java program to find the largest among three numbers.

[PYQ – 2022]
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Largest = " + max);
    }
}

🔸Q7. Write a Java program to check whether a character is a vowel or not.

[PYQ – 2021]


import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}

 🔸 Q8. Write a Java program to reverse a number.

[PYQ – 2020]


import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed = " + rev);
    }
}

🔸 Q9. Write a Java program to find the sum of digits of a number.

[PYQ – 2019]

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum = " + sum);
    }
}


 🔸 Q10. Write a Java program to count the number of even and odd numbers in an array.

[PYQ – 2022]

public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}

 🔸Q11. Write a Java program to search an element in an array.

[PYQ – 2018]

import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int key = sc.nextInt();
        boolean found = false;
        for (int i : arr) {
            if (i == key) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}

 Q12. Write a Java program to print Fibonacci series up to n terms.

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
