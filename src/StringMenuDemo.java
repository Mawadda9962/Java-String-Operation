import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String text = input.nextLine();

        System.out.println("---STRING MENU ---");
        System.out.println("1. Find The Length of the String");
        System.out.println("2. Convert the String to UPPERCASE");
        System.out.println("3. Convert the String to lowercase");
        System.out.println("4. Check if string contains a word");
        System.out.println("5.Compare with another string");
        System.out.print("Enter your choice (1-5): ");


    }
}
