public class StringLoopDemo {
    public static void main(String[] args){
        String title = "The Dark Room 123";
        System.out.println(title);
        System.out.println(title.length());

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        System.out.println("\nCharacters in the string:");
        for(int i = 0; i < title.length(); i++){

            char c = title.charAt(i);
            System.out.println(c);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowels++;
            }
            else if(Character.isLetter(c)){
                consonants++;
            }
            else if(Character.isDigit(c)){
                digits++;
            }

        }

        System.out.println("The total of Vowels: " + vowels);
        System.out.println("The total of consonants: " + consonants);
        System.out.println("The total of Digits: " + digits);



    }
}
