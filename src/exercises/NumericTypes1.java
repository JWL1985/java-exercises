package exercises;
import java.util.Scanner;


public class NumericTypes1 {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int length = in.nextInt();
        System.out.println("Enter width of rectangle: ");
        int width = in.nextInt();
        int area = length * width;
        System.out.println("The area of your rectangle = " + area);
    }
}
