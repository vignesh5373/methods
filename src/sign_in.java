/**
 * Created by vignesh on 07/10/20.
 */
import java.util.Scanner;
public class sign_in {

    public static void signin() {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String user_name = object.nextLine();
        System.out.println("Enter your password:");
        String password = object.nextLine();
        System.out.println("\n User name:" + user_name);
        System.out.println("\n Password:" + password);
    }
    public static void main(String[] args) {

        sign_in.signin();
        System.out.println("\n login is successful");
    }

}

