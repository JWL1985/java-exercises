package exercises;
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String first_name = in.nextLine();
        System.out.println("Hello, " + first_name);
    }
}
