//Find the Smallest Number in an Array
public class MinElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 7, 1};

        int min = arr[0]; // Pehle element ko sabse chhota maan lo

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Naya min mil gaya
            }
        }
        System.out.println("Smallest number: " + min);
    }
}
