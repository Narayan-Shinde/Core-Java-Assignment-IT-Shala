package Operators;

public class Assignment10a {
        public static void main(String[] args) {
            // Initialize variables
            int a = 6;
            int b = 8;

            // Print initial values
            System.out.println("Before swapping: a = " + a + ", b = " + b);

            // Swap values using a third variable
            int temp = a;
            a = b;
            b = temp;

            // Print swapped values
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }


}
