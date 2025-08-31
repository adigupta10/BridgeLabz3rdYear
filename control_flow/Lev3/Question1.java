package Level3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1582) {
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year (Approach 1).");
                    } else {
                        System.out.println(year + " is NOT a Leap Year (Approach 1).");
                    }
                } else {
                    System.out.println(year + " is a Leap Year (Approach 1).");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year (Approach 1).");
            }
        }
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year (Approach 2).");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year (Approach 2).");
        }

        sc.close();
    }
}
