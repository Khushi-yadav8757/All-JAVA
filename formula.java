public class FormulaExamples {
    public static void main(String[] args) {
 double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        double backToCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature Conversion:");
        System.out.println("Celsius to Fahrenheit: " + fahrenheit);
        System.out.println("Fahrenheit to Celsius: " + backToCelsius);
        System.out.println("-----------------------------------");
    }
}
