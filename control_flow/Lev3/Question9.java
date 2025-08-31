package Level3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } 
        else {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } 
            else {
                System.out.println(number + " is NOT an Abundant Number.");
            }
        }

        sc.close();
    }
}
