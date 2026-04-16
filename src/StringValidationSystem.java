import java.util.Scanner;

public class StringValidationSystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String text = input.nextLine();

        System.out.println(text);

        System.out.println(text.length());

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        Scanner searchWord = new Scanner(System.in);

        System.out.println("Enter a word to search: ");
        String word = input.nextLine();

        System.out.println(text.contains(word));


        Scanner compWord = new Scanner(System.in);

        System.out.println("Enter a string for comparison: ");
        String comparison =input.nextLine();

        System.out.println(comparison.equalsIgnoreCase(text));

        System.out.println();



         }
}
