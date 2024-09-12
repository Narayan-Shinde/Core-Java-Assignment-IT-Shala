package Operators;

public class Assignment13 {
        public static void main(String[] args) {
            // Hardcoded 5-digit number
            int number = 12345; // You can change this value to test with other numbers

            // Extract the first digit
            int firstDigit = number / 10000; // Integer division to get the first digit

            // Extract the second last digit
            int secondLastDigit = (number / 10) % 10; // Remove last digit and get the new last digit

            // Calculate the sum
            int sum = firstDigit + secondLastDigit;

            // Output the result
            System.out.println("Sum of the first and the second last digit: " + sum);
        }


}
