package Operators;

public class Assignment12 {

        public static void main(String[] args) {
            // Total number of students and boys
            int totalStudents = 90;
            int totalBoys = 45;

            // Calculate total students who secured grade 'A'
            int gradeAStudents = (50 * totalStudents) / 100; // 50% of total students

            // Number of boys who secured grade 'A'
            int gradeABoys = 20;

            // Calculate the total number of girls who secured grade 'A'
            int gradeAGirls = gradeAStudents - gradeABoys;

            // Output the result
            System.out.println("Total number of girls securing grade 'A': " + gradeAGirls);
        }


}
