public class StringAnalysisDemo {
    public static void main(String[] args){

        String text = "Java Programming Language";
        System.out.println(text);
        System.out.println(text.length());

        String text2 = "C++ Programming Language";
        System.out.println(text.equals(text2));

        System.out.println(text.indexOf("P"));
        System.out.println(text.startsWith("J"));
        System.out.println(text.endsWith("Language"));


    }
}
