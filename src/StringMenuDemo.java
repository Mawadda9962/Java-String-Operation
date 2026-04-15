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

        int userChoice = input.nextInt();
        input.nextLine();

        switch (userChoice){
            case 1:
                System.out.println("Length: " + text.length());
                break;

            case 2:
                System.out.println("UPPERCASE: " + text.toUpperCase());
                break;

            case 3:
                System.out.println("lowercase: " + text.toLowerCase() );
                break;

            case 4:
                System.out.println("Enter the word: ");
                String word = input.nextLine();

                if (text.contains(word)){
                    System.out.println("The String contain: " + word);
                }else{
                    System.out.println("The String does not contain: " + word);
                }
                break;

            case 5:
                System.out.print("Enter another string: ");
                String other = input.nextLine();

                if(text.equalsIgnoreCase(other)){
                    System.out.println("Both strings are equal (ignore case).");
                } else {
                    System.out.println("Strings are NOT equal.");
                }
                break;

            default:
                System.out.println("Invalid menu choice. Please select 1-5.");
        }

        }


    }

