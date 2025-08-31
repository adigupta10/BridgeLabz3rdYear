package Level1;
import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fee = sc.nextInt();;
        double discountPercent = sc.nextInt();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount+" and final discounted fee is INR " + finalFee);
    }
}
