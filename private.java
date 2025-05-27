class Student {
    private String name;   // 🔒 hidden
    private int age;

    // 👀 Getter - data ko read karne ke liye
    public String getName() {
        return name;
    }

    // ✏️ Setter - data set/update karne ke liye
    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Khushi");  // setter se set kiya
        s1.setAge(20);

        System.out.println("Name: " + s1.getName()); // getter se access kiya
        System.out.println("Age: " + s1.getAge());
    }
}


