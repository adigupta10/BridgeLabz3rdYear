package Level2;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseCm = sc.nextDouble();
        double heightCm = sc.nextDouble();
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq inch is "+areaIn2+" and sq cm is "+areaCm2);
    }
}
