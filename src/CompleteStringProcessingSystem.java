import java.util.Scanner;

public class CompleteStringProcessingSystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String text = input.nextLine();

        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        System.out.println("Enter word for searching: ");
        String word = input.nextLine();

        System.out.println(text.contains(word));

        System.out.println("Enter word for comparison: ");
        String comparisonWord = input.nextLine();
        System.out.println(text.equalsIgnoreCase(comparisonWord));

    }
}
