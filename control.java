//controlflow
public class ControlFlowExample {
    public static void main(String[] args) {
        int num = 10;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int day = 2;
        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other Day");
        }
    }
}
