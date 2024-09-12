package Operators;

public class Assignment16 {
        public static void main(String[] args) {
            // Hardcoded 3-digit number
            int number = 132; // You can change this value to test with other 3-digit numbers

            // Extract the digits
            int hundreds = number / 100;       // Extracts the hundreds place
            int tens = (number / 10) % 10;     // Extracts the tens place
            int units = number % 10;           // Extracts the units place

            // Form the reversed number
            int reversedNumber = units * 100 + tens * 10 + hundreds;

            // Output the result
            System.out.println("Reversed number: " + reversedNumber);
        }

}
