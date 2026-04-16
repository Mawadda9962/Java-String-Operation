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

        if(text.length() > 0){
            System.out.println(text.charAt(0));
        }
        else{
            System.out.println("The text is empty");
        }

        int vowCount = 0;
        for(int i = 0; i < text.length(); i++){
            char a = text.charAt(i);
            System.out.println(a);


            if (a == 'a' || a == 'e' || a == 'i' ||
                    a == 'o' || a == 'u' ||
                    a == 'A' || a == 'E' || a == 'I' ||
                    a == 'O' || a == 'U') {
                vowCount++;
            }
        }

        System.out.println("Total vowels: " + vowCount);

        if (text.length() >= 10){
            System.out.println("The text is good");
        }
        else{

        }

    }
}
