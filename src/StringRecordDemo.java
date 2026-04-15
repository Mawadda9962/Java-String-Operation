public class StringRecordDemo {
    public static void main(String[] args){

        String text = " Java Language Programming ";
        System.out.println(text);
        System.out.println(text.trim());

        String name1 = "Mawadda";
        String name2 = "Mawadda";

        System.out.println(name1.equalsIgnoreCase(name2));

        String[] split = text.split(" ");

        System.out.println("Split Record:");
        for(String part : split){
            System.out.println(part.trim());
        }

        String title = "";
        System.out.println(title.isEmpty());

        System.out.println(title.charAt(0));


    }
}
