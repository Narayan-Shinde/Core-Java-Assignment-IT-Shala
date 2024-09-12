package Operators;

public class Assignment15 {
        public static void main(String[] args) {
            // Hardcoded 3-digit number
            int number = 132; // You can change this value to test with other 3-digit numbers

            // Extract the digits
            int hundreds = number / 100;       // Extracts the hundreds place
            int tens = (number / 10) % 10;     // Extracts the tens place
            int units = number % 10;           // Extracts the units place

            // Calculate the sum of the digits
            int sum = hundreds + tens + units;

            // Output the result
            System.out.println("Sum of the digits: " + sum);
        }


}
