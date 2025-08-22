package Level1;
public class Question5 {
    public static void main(String[] args) {
        int pens=14;
        int students=3;
        int pens_per_student = pens/students;
        int remaining_pens = pens % students;  
        System.out.println("The Pen Per Student is " + pens_per_student + " and the remaining pen not distributed is " + remaining_pens);
    }
}
