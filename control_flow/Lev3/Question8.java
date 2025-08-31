package Level3;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } 
        else {
            int originalNumber = number;
            int sum = 0;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += digit;
                originalNumber = originalNumber / 10; 
            }
            if (number % sum == 0) {
                System.out.println(number + " is a Harshad Number.");
            } 
            else {
                System.out.println(number + " is NOT a Harshad Number.");
            }
        }

        sc.close();
    }
}
