public class StringProcessDemo {
    public static void main(String[] args){

      String employeeRecord = " Nasser, Counter, Nasser@gmail.com ";

        System.out.println(employeeRecord);

        System.out.println(employeeRecord.trim());

       String[] split = employeeRecord.split(",");

        System.out.println("Split Record:");
        for(String part : split){
            System.out.println(part.trim());
        }

        String name1 = "Nasser";
        String name2 = "nasser";

        System.out.println(name1.equalsIgnoreCase(name1));

        String name3 = "";
        System.out.println(name3.isEmpty());

    }
}
