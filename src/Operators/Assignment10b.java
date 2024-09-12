package Operators;

public class Assignment10b {
        public static void main(String[] args) {
            // Initialize variables
            int a = 6;
            int b = 8;

            // Print initial values
            System.out.println("Before swapping: a = " + a + ", b = " + b);

            // Swap values without using a third variable
            a = a + b; // a now becomes 14 (6 + 8)
            b = a - b; // b becomes 6 (14 - 8)
            a = a - b; // a becomes 8 (14 - 6)

            // Print swapped values
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
}
