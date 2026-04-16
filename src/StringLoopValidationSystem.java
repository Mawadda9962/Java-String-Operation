import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String text = input.nextLine();

        System.out.println(text);
        System.out.println(text.length());
    }

}
