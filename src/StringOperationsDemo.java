import java.util.Locale;

public class StringOperationsDemo {
    public static void main(String[] args){

        String name = "Mawadda";

        System.out.println("Name: " + name);

        System.out.println("\n--- Length --- "+ name.length());

        System.out.println("\n---Uppercase--- " + name.toUpperCase());
        System.out.println("\n---Lowercase--- " + name.toLowerCase());

        String companyName = "CodeLine";

        System.out.println(name.concat(companyName));


    }

}
