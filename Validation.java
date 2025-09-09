import java.util.*;
import java.lang.*;
class Validation{
    static String username_original="Bala_user1";
    static String password_original="Bala_2349nhfu";
    public static void main(String args[]){
        String user_name_input;
        String password_input;
        Scanner sc = new Scanner(System.in);
        System.out.print("User Name:  ");
        user_name_input=sc.nextLine();
        System.out.print("Password:  ");
        password_input=sc.nextLine();
        if(!user_name_input.equals(username_original)){
            System.out.println("UserNotFound");
        }
        else if(password_input!=password_original){
            System.out.println("InCorrectPassword");
        }
        else{
            System.out.println("welcome to my world...!!");
        }
    }
    
    
}