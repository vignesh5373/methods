/**
 * Created by vignesh on 07/10/20.
 */
import java.util.Scanner;
public class sign_in {
    static Scanner object = new Scanner(System.in);

    public static void registartion() {

        //input fields from registration page

        //Email address field

        System.out.println("\nEnter your registered email address:");
        String Email = object.nextLine();


//user name field

        System.out.println("\n Enter your user name:");
        String user_name = object.nextLine();


        //Password field

        System.out.println("\n Create your password:");
        String password = object.nextLine();
        System.out.println("\n Confirm your password:");
        String Confirm_password = object.nextLine();

        //Mobile number field

        System.out.print("\n Enter your registered phone number:");
        Long phone = object.nextLong();

        //Submitting all details

        if(Email.equals("vignesh@gmail.com")&& user_name.equals("vicky")&& phone.equals(978948)) {
            System.out.println("Registartion is successful");
        }else
        {
            System.out.println("Registartion is unsuccessful");

        }

    }
    //Sign in flow

    public static void signin()
    {
        System.out.println("\nEnter your registered email address:");
        String Email = object.nextLine();
        System.out.println("\nEnter your password:");
        String password = object.nextLine();

        //Two factor authentication
        //Checking user name and password

        if(Email.equals("vignesh@gmail.com")&& password.equals("vicky@15")) {
            System.out.println(" Login successful \n Enter your OTP number to sent your mobile number: ");
        }
        else{
            System.out.println("Incoreect user name or password");
        }

        //Checking OTP

        int OTP = object.nextInt();

        if(OTP==1234)
        {
            System.out.println("Home page");
        }
        else{
            System.out.println("Incorrect OTP");
        }


    }

    public static void acc_details(String user_name,String Email,long phone,int acc_num,double balance,String acc_type){

        System.out.println("\nuser name:"+user_name+"\nEmail address:"+Email+"\nPhone number:"+phone+"\nAccount number:"+acc_num+"\nAmount balance:"+balance+"Account type:"+acc_type);
    }

    public static void main(String[] args) {

        sign_in.signin();


    }
}
