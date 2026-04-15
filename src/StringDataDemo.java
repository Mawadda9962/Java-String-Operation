public class StringDataDemo {
    public static void main(String[] args){

        String majer = "Electronics and Instrumentation";
        System.out.println(majer);

        System.out.println("---UpperCase---" + majer.toUpperCase());
        System.out.println("---LowerCase---" + majer.toLowerCase());

        System.out.println(majer.indexOf("and"));
        System.out.println(majer.substring(2));
        System.out.println(majer.contains("Electronics"));




    }
}
