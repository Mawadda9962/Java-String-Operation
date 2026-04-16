import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String text = input.nextLine();

        System.out.println(text);
        System.out.println(text.length());


        int vowCount = 0;

        for(int i = 0; i <text.length(); i++){
            char a = text.charAt(i);
            System.out.println(a);


            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
                    a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                vowCount++;
            }
        }

        System.out.println(vowCount);
        }
    }


