package Operators;

public class Assignment4 {
        public static void main(String[] args) {
            // Step 1: Initialize the number 2345
            int number = 2345;

            // Step 2: Add 8 to the number (number += 8)
            number += 8; // equivalent to number = number + 8
            System.out.println("After addition: " + number); // Output: 2353

            // Step 3: Divide the result by 3 (number /= 3)
            number /= 3; // equivalent to number = number / 3
            System.out.println("After division: " + number); // Output: 784

            // Step 4: Take modulus with 5 (number %= 5)
            number %= 5; // equivalent to number = number % 5
            System.out.println("After modulus: " + number); // Output: 4

            // Step 5: Multiply the result by 5 (number *= 5)
            number *= 5; // equivalent to number = number * 5
            System.out.println("Final result: " + number); // Output: 20
        }


}
