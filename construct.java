 What is constructor overloading?
Answer:
When a class has multiple constructors with different parameters.
Ex:--

 class Student {
    String name;
    int age;

    Student(String n) {
        name = n;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }
}
