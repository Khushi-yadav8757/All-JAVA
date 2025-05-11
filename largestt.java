// Find the Largest Number in an Array
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 7, 1};

        int max = arr[0]; // Pehle element ko maan lo sabse bada

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Naya max mil gaya
            }
        }

        System.out.println("Largest number: " + max);
    }
}
