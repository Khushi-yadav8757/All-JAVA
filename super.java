What is the use of super keyword?
Answer:
Used to refer parent class members (constructor, method, variable).
Example..
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(super.x); // Prints 10
    }
}
