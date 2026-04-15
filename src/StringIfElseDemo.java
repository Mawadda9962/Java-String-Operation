public class StringIfElseDemo {
    public static void main(String[] args){

        String userName = "Mawadda993";
        System.out.println(userName);

        if(userName.length() > 5){
            System.out.println("UserName length is valid");
        }else{
            System.out.println("UserName is short");
        }

        String Password = "234566";

        if (Password.equals("234566")){
            System.out.println("Password is correct");
        }else{
            System.out.println("Password is incorrect");
        }

        if(userName.contains("a")){
            System.out.println("Username contains the letter 'a'.");
        } else {
            System.out.println("Username does not contain the letter 'a'.");
        }

        if(userName.isEmpty()){
            System.out.println("Username is empty.");
        } else {
            System.out.println("Username is NOT empty.");
        }


    }
}
