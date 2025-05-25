class Student {
    String name;

    Student(String n) {  // constructor
        name = n;
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Khushi");
        s1.display();
    }
}
