package org.launchcode.java.demos.java4python;
import java.util.Scanner;
/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {
        Scanner first_name;

        first_name = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        System.out.println("Hello, " + first_name);
    }


}
