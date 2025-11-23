import java.util.Scanner;
public class CalculateSum {
    public static void CalculateSum ()  {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = a+b;
        System.out.println("Sum is : "+Sum);
    }
    public static void main(String[] args) {
        CalculateSum();
    }
}
