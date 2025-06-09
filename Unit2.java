 ✅ 🔹 1. Class and Object in Java

-   A class is a blueprint for creating objects.
-   An object is a runtime instance of a class.

 🔸 Syntax:

class Student {
    String name;
    int age;

    void show() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();  // Object creation
        s.name = "Khushi";
        s.age = 20;
        s.show();
    }
}

📝 PYQ:

Q. What is a class and object in Java? Explain with example.
[PYQ – 2020, 2022]


 ✅ 🔹 2. Access Modifiers in Java

| Modifier    | Within Class | Same Package | Subclass | Other Package       |
| ----------- | ------------ | ------------ | -------- | ------------------- |
| `public`    | ✅            | ✅            | ✅        | ✅                   |
| `protected` | ✅            | ✅            | ✅        | ❌ (except subclass) |
| `default`   | ✅            | ✅            | ❌        | ❌                   |
| `private`   | ✅            | ❌            | ❌        | ❌                   |


public class Demo {
    private int x = 10;
    protected int y = 20;
    public int z = 30;
}


 📝 PYQ:

Q. Explain various access modifiers used in Java.
[PYQ – 2019, 2021]
  
 ✅ 🔹 3.`this` Keyword in Java

`this` refers to the **current object of the class.
this is a reference variable that refers to the current class object.
It is mainly used to differentiate between instance and local variables when they have the same name. 
  It can also be used to invoke constructors, methods, and pass as arguments
class Student {
    String name;

    Student(String name) {
        this.name = name;  // this refers to current object
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

📝 PYQ:

Q. What is `this` keyword? Write a Java program to demonstrate its use.
  [PYQ – 2022]

 ✅ 🔹 4.Method Overloading (Compile-Time Polymorphism)

Same method name but different parameters.
  
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}

 📝 PYQ:

Q. Write a program to show method overloading in Java.
  [PYQ – 2018, 2021]

✅ 🔹 5. Static Members (Variable + Method)

- Static variable: Shared by all objects
- Static method: Called without creating object

class Test {
    static int count = 0;

    Test() {
        count++;
    }

    static void showCount() {
        System.out.println("Object Count: " + count);
    }
}

Q. Differentiate between static and non-static members in Java.
  [PYQ – 2020]

 ✅ 🔹 6. Constructors in Java

A constructor is a special method used to initialize objects.

Types:

1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor (manual in Java)
class Student {
    String name;

    Student() {
        name = "Default";
    }

    Student(String name) {
        this.name = name;
    }

    Student(Student s) {
        this.name = s.name;  // copy constructor
    }
}

Q. Explain different types of constructors in Java with example.
  [PYQ – 2019, 2021, 2023]

 ✅ 🔹 7. Garbage Collection in Java

- Java manages memory using automatic garbage collection.
- JVM destroys unreferenced objects and calls `finalize()` method before doing so.

protected void finalize() {
    System.out.println("Object is destroyed");
}

Q. What is garbage collection in Java? How it works?
[PYQ – 2021]

 ✅ 🔹 8. Final Keyword

- Final variable = constant
- Final method = cannot be overridden
- Final class = cannot be inherited


final int x = 10;           // constant
final class A {}            // can't be inherited


 📝 PYQ:

Q. What is final keyword? Explain its types with example.
[PYQ – 2022]
 ✅ 🔹 9. Nested Class in Java

//A class defined inside another class.

class Outer {
    class Inner {
        void show() {
            System.out.println("Inside Inner");
        }
    }
}


To access:

Outer o = new Outer();
Outer.Inner i = o.new Inner();
i.show();


 📝 PYQ:

Q. Explain nested class in Java with example.
  [PYQ – 2021]
 ✅ 🧾 Summary Table of Key Concepts

| Concept           | Key Point                           |
| ----------------- | ----------------------------------- |
| Class/Object      | Blueprint and instance              |
| Access Modifiers  | public, private, protected, default |
| this              | Refers to current object            |
| Overloading       | Same method, different parameters   |
| Static            | Belongs to class, not object        |
| Constructors      | Initialize objects                  |
| Final             | Constant, unchangeable              |
| Garbage Collector | Auto memory management by JVM       |
| Nested Class      | Class inside another class          |

 ✅ 📘 Sample Unit 2 PYQ Program List

1. Method overloading program ✅
2. Constructor types program ✅
3. Static vs non-static program ✅
4. Use of `this` keyword ✅
5. Garbage collector demo using `finalize()` ✅
6. Program using final variable/method ✅
7. Nested class access program ✅

✅ 1. Class
A class is a blueprint for creating objects. It defines variables and methods inside it.
Think of it as a design of an object.

Syntax:
class Car {
  String color;
  void drive() {
    System.out.println("Driving...");
  }
}
✅ 2. Object
An object is an instance of a class. It holds real data and can access class methods.

Example:

Car c1 = new Car();  // c1 is an object of class Car
c1.drive();          // calling method using object

✅ 3. Inheritance
Inheritance allows one class (child) to use the properties and methods of another class (parent). It helps in code reusability.

Syntax:
class Animal {
  void sound() {
    System.out.println("Animal Sound");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Dog Barks");
  }
}
Note: Dog inherits sound() from Animal.

✅ 4. Polymorphism
Polymorphism means one task, many forms.
Two types:

Compile-time (Method Overloading)

Run-time (Method Overriding)

✅ Overloading Example:

void add(int a, int b) {}
void add(double a, double b) {}
✅ Overriding Example:

class A {
  void show() { System.out.println("A"); }
}
class B extends A {
  void show() { System.out.println("B"); } // overrides A's method
}
✅ 5. Encapsulation
Encapsulation means hiding data using private and accessing it via getter/setter. It helps protect data from unauthorized access.

Example:

class Student {
  private int age;
  
  public void setAge(int a) {
    age = a;
  }

  public int getAge() {
    return age;
  }
}
✅ 6. Java Structure
Basic structure of every Java program:

class Main {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }
}
✅ Key Parts:

class: container

main(): starting point

System.out.println: print output

✅ 7. Data Types
Used to define the type of data a variable holds.

✅ Primitive Data Types:

Data Type	Example Value	Size
int	10	4 bytes
float	10.5f	4 bytes
char	'A'	2 bytes
boolean	true/false	1 bit
double	99.99	8 bytes

✅ Non-Primitive Types:

String

Arrays

Classes

Interfaces

