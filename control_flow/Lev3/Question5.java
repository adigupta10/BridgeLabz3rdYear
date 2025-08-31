package Level3;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } 
        else {
            int originalNumber = number;
            int sum = 0;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += digit * digit * digit;
                originalNumber = originalNumber / 10;
            }
            if (sum == number) {
                System.out.println(number + " is an Armstrong Number.");
            } 
            else {
                System.out.println(number + " is NOT an Armstrong Number.");
            }
        }

        sc.close();
    }
}
