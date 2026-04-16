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

        System.out.println("Enter prefix value: ");
        String prefixValue = input.nextLine();
        System.out.println(prefixValue);

        System.out.println(text.startsWith(prefixValue));

        System.out.println("Enter suffix value: ");
        String suffixValue   = input.nextLine();
        System.out.println(suffixValue);

        System.out.println(text.endsWith(suffixValue));

        if(text.length() >= 8){
            System.out.println("The length is good");
        }
        else{
            System.out.println("The text is too short");
        }








    }
}
