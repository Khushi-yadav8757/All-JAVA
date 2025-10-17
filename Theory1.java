// Introduction to Java
  
Java is an object-oriented, high-level, class-based programming language developed by James Gosling at Sun Microsystems in 1995.
Platform Independent: Write Once, Run Anywhere (WORA)
Compiled + Interpreted: Java compiler converts code to Bytecode → JVM executes it.

// Features of Java:
Simple
Object-Oriented
Platform Independent
Secure
Robust
Multithreaded
High Performance
  
//Data Types, Variables, and Operators
 Data Types:
Primitive: int, float, char, double, boolean, byte, short, long

Non-Primitive: String, Arrays, Classes, Interfaces
 // Variables:
Local
Instance
Static

// Operators:
  
Arithmetic: +, -, *, /, %
Relational: ==, !=, >, <, >=, <=
Logical: &&, ||, !
Assignment: =, +=, -=, *=, /=

//Control Statements
  
if, if-else, else-if ladder
switch-case
  
Loops:

for
while
do-while
for-each (used with arrays/collections)
Break and Continue

//Object-Oriented Programming Concepts (OOPs)
  
Principles:

Class & Object
Encapsulation – hiding data using access modifiers and getters/setters
Abstraction – hiding internal details, using abstract classes and interfaces
Inheritance – acquiring features from parent class (using extends)
Polymorphism – compile-time (method overloading) & run-time (method overriding)
// Keywords:
this, super, static, final, new, instanceof

//Classes and Objects
  
A class is a blueprint.
An object is an instance of a class.

// Constructors:
Default
Parameterized
Copy

// Inheritance in Java
  
Single
Multilevel
Hierarchical

(Java does not support multiple inheritance via class → use interface)

Use super to call parent class constructor/method.

// Polymorphism
  Compile-time Polymorphism (Method Overloading)
Same method name, different parameters

 Runtime Polymorphism (Method Overriding)
Subclass overrides parent class method

// Abstraction
Abstract Class: use abstract keyword, can have both abstract and non-abstract methods
Interface: all methods are abstract by default (Java 8+ allows default and static methods)

 Encapsulation
Wrapping data into a single unit using class

Use private variables + public getter/setters

// Packages and Access Modifiers
Package: group of related classes (e.g., java.util, java.io)

Access Modifiers:

private: accessible only within the class

default: accessible within package

protected: package + subclass

public: accessible everywhere

// Exception Handling
  
Try-Catch-Finally Block
Throw and Throws keywords
Checked Exception: during compilation (IOException)
Unchecked Exception: during runtime (NullPointerException, ArithmeticException)

//. Multithreading
Thread: lightweight process
Create thread using:
Extending Thread class
Implementing Runnable interface

// Methods:
  
start(), run(), sleep(), join(), yield()

// String Handling
  
String (immutable), StringBuilder (mutable, not thread-safe), StringBuffer (mutable, thread-safe)
// String Methods:
length(), charAt(), equals(), compareTo(), toUpperCase(), substring(), replace(), etc.

// Arrays
  
Homogeneous collection of elements

int[] arr = new int[5]; // Declaration and Initialization
Multidimensional Array: int[][] matrix = new int[3][3];

✅ 15. Collections Framework
Interfaces: List, Set, Map, Queue

Classes: ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, PriorityQueue

🔹 ArrayList Example:
java
Copy
Edit
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
✅ 16. Java I/O (Input/Output)
Streams:

InputStream, OutputStream (for binary)

Reader, Writer (for character)

🔹 File Handling:
java
Copy
Edit
File f = new File("file.txt");
Scanner sc = new Scanner(f);
✅ 17. Java 8 Features
Lambda Expressions

Functional Interfaces

Stream API

Method References

Default and Static Methods in Interface

✅ 18. JDBC (Java Database Connectivity)
Steps:

Load Driver

Establish Connection

Create Statement

Execute Query

Close Connection

✅ 19. GUI with AWT & Swing
AWT: older, platform-dependent

Swing: lightweight, platform-independent

Components: JFrame, JButton, JLabel, JTextField, etc.

✅ 20. Applets (Less Used Now)
Small Java programs that run in a browser

Lifecycle: init(), start(), paint(), stop(), destroy()

