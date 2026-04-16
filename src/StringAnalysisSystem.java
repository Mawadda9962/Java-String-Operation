import java.util.Scanner;

public class StringAnalysisSystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = input.nextLine();

        System.out.println(userName);
        System.out.println(userName.length());

        Scanner word = new Scanner(System.in);
        System.out.println("Enter the word that you want to search: ");
        String Word = input.nextLine();

        System.out.println(Word.contains(userName));

        Scanner Comp = new Scanner(System.in);
        System.out.println("Enter String for comparison: ");
        String Compare = input.nextLine();

        System.out.println(userName.equalsIgnoreCase(Compare));

        if(userName.length() > 0 ){
            System.out.println(userName.charAt(0));

        }
        else{
            System.out.println("There is no username entered");
        }


        if(userName.length() > 10 ){
            System.out.println("The entered username is good");

        }
        else{
            System.out.println("The entered username is good");
        }


    }
}
