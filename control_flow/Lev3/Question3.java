package Level3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        } 
        else {
            double total = physics + chemistry + maths;
            double percentage = total / 3;
            String grade;
            String remarks;

            if (percentage >= 80) {
                grade = "A";
                remarks = "Excellent";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Very Good";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Good";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Average";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Needs Improvement";
            } else {
                grade = "R";
                remarks = "Fail";
            }
            System.out.println("\nTotal Marks: " + total);
            System.out.printf("Average Marks/Percentage: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }

        sc.close();
    }
}
