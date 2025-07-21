  UNIT 3: Inheritance, Packages and Interfaces

 1. Inheritance in Java
  Definition:
Inheritance is the mechanism in Java by which one class is allowed to inherit the fields and methods of another class.

>  `extends` keyword is used for inheritance.

 Why use Inheritance?

* Reusability of code.
* Improves code structure.
* Supports polymorphism.

   Types of Inheritance in Java

| Type               | Description                                     | Supported in Java|
| ------------------ | ----------------------------------------------- | -----------------|
| Single Inheritance | One class inherits another                      | Yes              |
| Multilevel         | A class inherits a class which inherits another |  Yes             |
| Hierarchical       | Multiple classes inherit the same superclass    |  Yes             |
| Multiple           | One class inherits from more than one class     |  No (via class)  |
| Hybrid             | Combination of above                            |  Via interface   |

  Program: Single Inheritance


class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}


-----------------------------------------------------------

 2. super keyword

Use of `super`:

* To call parent class constructor.
* To access parent class method or variable.

   Example: Using `super()` to call parent constructor


class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls Animal constructor
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
--------------------------------------------------------------
 3. Method Overriding

Definition:
If subclass has a method with same name, return type and parameters as parent class, it overrides the parent method.
  Example:
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Dog barks
    }
}
-----------------------------------------------------------
 4. final keyword

* `final class` → cannot be extended.
* `final method` → cannot be overridden.
* `final variable` → constant value.


   5.Abstract Class

Definition:
An abstract class cannot be instantiated and may contain abstract methods (without body).

  Syntax:
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
-----------------------------------------------------------------------
 Packages in Java

  1. Definition

Package is a namespace that organizes a set of related classes and interfaces.

>  Keyword: `package`

  2. Types of Packages

| Type             | Example                |
| ---------------- | ---------------------- |
| Built-in package | `java.util`, `java.io` |
| User-defined     | Created by programmer  |

 Program: User-defined Package
  
// File: mypackage/Message.java
package mypackage;

public class Message {
    public void display() {
        System.out.println("Hello from package!");
    }
}

// File: TestPackage.java
import mypackage.Message;

public class TestPackage {
    public static void main(String[] args) {
        Message m = new Message();
        m.display();
    }
}
------------------------------------------------------------------
 Interfaces in Java
  1. Definition

Interface is a blueprint of a class. It has only abstract methods and constants.

>  Keyword: `interface`

 2.Syntax and Example


interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}


>  Interface is used to achieve multiple inheritance in Java.

 3. Differences: Abstract Class vs Interface

| Feature              | Abstract Class             | Interface              |
| -------------------- | -------------------------- | ---------------------- |
| Methods              | Can have abstract + normal | Only abstract (Java 7) |
| Constructors         | Yes                        | No                     |
| Multiple Inheritance | Not supported              | Supported              |

---------------------------------------------------------------------------------------------------

  PYQs (Previous Year Questions – AKTU)
  Q1: What is inheritance? Explain types with example.

[2009, 2015, 2022]
  Explain with Dog-Animal program.
 Q2: Differentiate between Abstract class and Interface.
  
[Repeated in 2014, 2018, 2021]
 Q3: What is method overriding? Write Java code to demonstrate it.

[AKTU 2016, 2020]
  Q4: Write the difference between packages and interfaces.

[AKTU 2015, 2017]
 Q5: What is the use of `super` keyword?

[2023]

Show constructor and method access example.

 Q6: Define interface. How is it implemented in Java?

[2019]
 Q7: Explain user-defined package with suitable example.
  [AKTU 2022]

 Summary (Quick Revision)

| Concept        | Key Points                         |
| -------------- | ---------------------------------- |
| Inheritance    | Reuse, `extends`, single & multi   |
| super          | Parent constructor/method access   |
| Overriding     | Subclass redefines method          |
| final          | Prevent change                     |
| Abstract class | Partial implementation             |
| Interface      | Full abstraction, multiple inherit |
| Package        | Namespace using `package` keyword  |

  Sure, Khushi! Let's go step by step:

---

##  **AKTU Java Unit 3 Syllabus (OOPs with Java)**

 **Unit 3: Inheritance, Package and Interfaces**

> * Inheritance: Single, Multilevel, Hierarchical
> * Method Overriding
> * `super` keyword
> * Final keyword
> * Abstract classes
> * Packages: Built-in & User-defined
> * Interfaces
> * Extending Interfaces
> * Implementing Interfaces
> * Differences between abstract class and interface

---

  PYQ Answers for Java Unit 3 (AKTU)
 Q1: What is inheritance? Explain its types with example.

(AKTU 2009, 2015, 2022)

  Answer:

Inheritance is the mechanism in Java by which one class acquires the properties (fields and methods) of another class using the `extends` keyword.

 Types of Inheritance in Java:

| Type         | Description                                  |
| ------------ | -------------------------------------------- |
| Single       | One subclass inherits one superclass         |
| Multilevel   | Derived class inherits another derived class |
| Hierarchical | Multiple subclasses inherit one superclass   |

> Java does not support multiple inheritance using classes to avoid ambiguity (but supports via interface).


   Example: Multilevel Inheritance
  
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

class Puppy extends Dog {
    void weep() { System.out.println("Weeping..."); }
}

public class Test {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}



  Q2: Differentiate between Abstract class and Interface.
  (AKTU 2014, 2018, 2021)

  Answer:

| Feature              | Abstract Class                    | Interface                               |
| -------------------- | --------------------------------- | --------------------------------------- |
| Keyword              | `abstract`                        | `interface`                             |
| Method type          | Can have both abstract & concrete | Only abstract (till Java 7)             |
| Variables            | Can be non-final                  | All variables are public, static, final |
| Multiple inheritance | Not supported                     | Supported                               |
| Constructors         | Can have constructors             | Cannot have constructors                |
| Access Modifiers     | Can have private/protected        | Only public                             |

 Q3: What is method overriding? Write Java code to demonstrate it.
  (AKTU 2016, 2020)
   Answer:

Method Overriding means defining a method in subclass with the same signature as in the superclass.

> Used for Runtime Polymorphism.

  Program:


class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting
        a.sound(); // Dog barks
    }
}

  Q4: Write the difference between packages and interfaces.

(AKTU 2015, 2017)

 Answer:

| Feature | Package                      | Interface                                     |
| ------- | ---------------------------- | --------------------------------------------- |
| Purpose | Organize classes             | Define contracts/blueprints                   |
| Syntax  | `package mypackage;`         | `interface MyInterface {}`                    |
| Access  | Use `import` keyword         | Use `implements` keyword                      |
| Usage   | Used for modular programming | Used for abstraction and multiple inheritance |

  Q5: What is the use of `super` keyword in Java?

(AKTU 2023)
   Answer:

`super` keyword refers to the immediate parent class object.
It is used for:

1. Calling parent class constructor.
2. Accessing parent class methods.
3. Accessing parent class fields.

  Example:
  
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // call parent method
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}


 Q6: Define interface. How is it implemented in Java?
  (AKTU 2019)
   Answer:

Interface is a reference type in Java similar to class, that can contain only abstract methods and constants (till Java 7).

> It is implemented using the `implements` keyword.

  Example:
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
-------------------------------------------------------------------
Q7: Explain user-defined package with suitable example.

(AKTU 2022)
Answer:

Package is a group of similar types of classes and interfaces.

User-defined package** is a package created by the programmer.

 Example:
// File: mypack/Message.java
package mypack;

public class Message {
    public void show() {
        System.out.println("Hello from package!");
    }
}

// File: TestPackage.java
import mypack.Message;

public class TestPackage {
    public static void main(String[] args) {
        Message m = new Message();
        m.show();
    }
}


>  Save both files properly and compile using:


javac -d . Message.java
javac TestPackage.java
