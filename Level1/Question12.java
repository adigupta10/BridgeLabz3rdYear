package Level1;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double height=sc.nextInt();
         double base=sc.nextInt();
         double area=0.5*base*height;
         System.out.print("The area of triangle is: "+area);
    }
}
