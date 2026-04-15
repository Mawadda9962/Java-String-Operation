public class StringValidationDemo {
    public static void main(String[] args){

        String text = "Java Programming Language";
        System.out.println(text);

        System.out.println(text.startsWith("Java"));
        System.out.println(text.endsWith("Language"));

        System.out.println(text.replace("Java", "C#"));
        System.out.println(text.substring(1));

        System.out.println(text.length());


    }
}
