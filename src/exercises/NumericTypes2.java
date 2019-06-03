package exercises;
import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String [] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        double miles = in.nextDouble();
        System.out.println("How many gallons of gas did you use?: ");
        double gas = in.nextDouble();
        double mpg = miles / gas;
        System.out.println("Your fuel consumption rate is: " + mpg + " miles per gallon.");

    }
}
