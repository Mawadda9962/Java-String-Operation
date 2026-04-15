public class StringIfElseIfDemo {
    public static void main(String[] args){

       String text = "Java Programming Language";
        System.out.println(text);

        if(text.isEmpty()){
            System.out.println("The string is empty");
        }
        else if (text.length() < 5){
            System.out.println("The text is too short");
        }
        else if (text.startsWith("Java")) {
            System.out.println("The string starts with Java");

        }
        else if (text.endsWith("Language")){
            System.out.println("The string ends with e");
        }
        else if (text.equalsIgnoreCase("Java Programming Language")){
            System.out.println("The string matches");
        }
        else{
            System.out.println("No Condition match");
        }
    }
}
