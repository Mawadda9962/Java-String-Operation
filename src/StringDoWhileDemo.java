public class StringDoWhileDemo {
    public static void main(String[] args){

        String text = "Java Programming Language is fun";
        System.out.println(text);

        System.out.println(text.length());

        int i = 0;
        int lowercase = 0;
        int spaces = 0;

        do{
            char a = text.charAt(i);
            System.out.println(a);

            if(Character.isLowerCase(a)){
                lowercase++;
            }

            if(a == ' '){
                spaces++;
            }



        }


    }
}
