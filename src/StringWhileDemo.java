public class StringWhileDemo {
    public static void main(String[] args){

        String title = "Java Programming Language";
        System.out.println(title);
        System.out.println(title.length());

        int n = 0;
        int spaces = 0;
        int upperCase = 0;

        while(n < title.length()){

            char a =title.charAt(n);
            System.out.println(a);

            if(n == ' '){
                spaces++;
            }

            if(Character.isUpperCase(a)){
                upperCase++;
            }

            n++;

        }

        System.out.println("Total number of spaces: " + spaces);
        System.out.println("Total number of UpperCase Latters: " + upperCase);







    }
}
