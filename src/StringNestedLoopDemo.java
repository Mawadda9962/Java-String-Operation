public class StringNestedLoopDemo {
    public static void main(String[] args){

        String text1 = "Java Programming Language";
        String text2 = "C++ Programming Language";

        System.out.println(text1);
        System.out.println(text2);

        System.out.println(text1.length());
        System.out.println(text2.length());

        int count = 0;

        for(int i = 0; i < text1.length(); i++){
            for (int j = 0; j < text2.length(); j++){

                if(text1.charAt(i) == text2.charAt(j)){
                    System.out.println(text1.charAt(i));
                    count++;
                }
            }
        }
        System.out.println(count);

        for(int i = 0; i < text1.length(); i++){
            for(int j = 0; j < text2.length(); j++){

                System.out.println(text1.charAt(i) + " vs " + text2.charAt(j));
            }
        }

    }
}
