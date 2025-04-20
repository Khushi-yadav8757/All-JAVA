// abstract class
abstract class Main {
  public String fname = "Karthik";
  public int age = 22;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2027;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
