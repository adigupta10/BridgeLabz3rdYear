package Level1;
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
