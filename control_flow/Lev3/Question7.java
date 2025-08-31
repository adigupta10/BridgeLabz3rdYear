package Level3;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Invalid input! Weight and height must be positive numbers.");
        } 
        else {
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal weight";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            System.out.printf("BMI: %.2f\n", bmi);
            System.out.println("Weight Status: " + status);
        }

        sc.close();
    }
}
