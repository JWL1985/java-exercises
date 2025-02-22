package exercises;
import java.util.Scanner;


public class Alice {
    public static void main(String [] args) {
        Scanner in;
        in = new Scanner(System.in);
        String str = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        System.out.println("Please enter a term to search for within the string: ");
        String search_term = in.nextLine();
        if (str.contains(search_term)) {
            System.out.println("YES, the term " + search_term + " is in the string.");
        } else {
            System.out.println("SORRY, the term " + search_term + " is not in the string");
        }

    }
}
