package Operators;

public class Assignment14 {
        public static void main(String[] args) {
            // Hardcoded 4-digit number
            int number = 5696; // You can change this value to test with other 4-digit numbers

            // Extract each digit
            int thousands = number / 1000;
            int hundreds = (number / 100) % 10;
            int tens = (number / 10) % 10;
            int units = number % 10;

            // Increase each digit by 2
            int newThousands = (thousands + 2) % 10;
            int newHundreds = (hundreds + 2) % 10;
            int newTens = (tens + 2) % 10;
            int newUnits = (units + 2) % 10;

            // Combine the new digits into the result number
            int result = newThousands * 1000 + newHundreds * 100 + newTens * 10 + newUnits;

            // Output the result
            System.out.println("The number with each digit increased by 2 is: " + result);
        }

}
