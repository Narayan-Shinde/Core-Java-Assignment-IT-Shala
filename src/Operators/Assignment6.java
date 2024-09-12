package Operators;

public class Assignment6 {
        public static void main(String[] args) {
            // Define the base and exponent
            int base = 7;
            int exponent = 5;
            int result = 1;

            // Calculate base^exponent using a loop
            for (int i = 1; i <= exponent; i++) {
                result *= base; // Multiply result by base in each iteration
            }

            // Output the result
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }


}
