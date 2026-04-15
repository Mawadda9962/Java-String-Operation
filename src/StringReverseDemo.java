public class StringReverseDemo {
    public static void main(String[] args){

        String name = "Mawadda";
        System.out.println(name);
        System.out.println(name.length());


        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));

        }

        String reversed = "";
        for(int i = name.length() - 1; i >= 0; i--){
            reversed = reversed + name.charAt(i);
        }

        System.out.println(reversed);

        char cr = 'a';
        int count = 0;

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == cr){
                count++;
            }
        }
        System.out.println("Character" + cr + "appears: " + count + "times");

    }
}
