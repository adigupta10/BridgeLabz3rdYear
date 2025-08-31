package Level1;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        double yards = feet / 3.0;
        double miles = yards / 1760.0;
        System.out.println(feet + " feet = " + String.format("%.2f", yards) + " yards");
    }
}
