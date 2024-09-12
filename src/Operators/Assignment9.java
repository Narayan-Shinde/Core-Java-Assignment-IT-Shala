package Operators;

public class Assignment9 {
        public static void main(String[] args) {
            // Marks in three subjects
            int marks1 = 78;
            int marks2 = 45;
            int marks3 = 62;

            // Calculate total marks
            int totalMarks = marks1 + marks2 + marks3;

            // Calculate percentage
            // Total maximum marks = 100 (per subject) * 3 (subjects) = 300
            double percentage = (totalMarks / 300.0) * 100;

            // Output the results
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        }


}
