package Level1;
import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height=sc.nextInt();
        double inch=height/2.54;
        double feet=inch/12;
        System.out.print("Your Height in cm is "+height+" while in feet is "+feet+" and in inches is "+inch);
    }
}
