import java.util.Scanner;

public class StringSearchModifySystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String text = input.nextLine();

        System.out.println("Original String: " + text);


        System.out.println("Enter the word for searching: ");
        String word = input.nextLine();


        System.out.println("Word found: " + text.contains(word));


        System.out.println("Enter the word to replace: ");
        String oldWord = input.nextLine();

        System.out.println("Enter the new word: ");
        String newWord = input.nextLine();

        String modifiedText = text.replace(oldWord, newWord);
        System.out.println("Modified String: " + modifiedText);


        if (modifiedText.length() >= 5) {
            System.out.println("Substring: " + modifiedText.substring(0, 5));
        } else {
            System.out.println("String too short for substring.");
        }

        if (modifiedText.length() > 0) {
            System.out.println("First character: " + modifiedText.charAt(0));
        } else {
            System.out.println("String is empty.");
        }

        if (modifiedText.length() > 8) {
            System.out.println("The modified string is long.");
        } else {
            System.out.println("The modified string is short.");
        }

        input.close();
    }
}