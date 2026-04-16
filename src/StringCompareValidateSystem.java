import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String text = input.nextLine();
        System.out.println(text);

        System.out.println(text.length());

        System.out.println("Enter word for comparison ");
        String compWord = input.nextLine();
        System.out.println(compWord);

        System.out.println(text.equals(compWord));




    }
}
