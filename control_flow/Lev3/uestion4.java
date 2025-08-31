package Level3;

import java.util.Scanner;

public class uestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("Invalid input! Prime numbers are greater than 1.");
        } 
        else {
            boolean isPrime = true; 
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } 
            else {
                System.out.println(number + " is NOT a Prime Number.");
            }
        }

        sc.close();
    }
}
