Information can be passed to methods as a parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
  for example....


  public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Kcc");
  }

  public static void main(String[] args) {
    myMethod("Khushi");
    myMethod("Sanjana");                      //fname is a "parameter", while Khushi, Sanjan,Anshu and Jyoti are "arguments".
    myMethod("Anshu");
    myMethod("Jyoti");
  }
}
