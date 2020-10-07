/**
 * Created by vignesh on 28/09/20.
 */
public class Main_method_Overload {

    public static void overload1(double a){
        System.out.println("hello1");
    }
    public static void overload1(double a,int b){
        System.out.println("hello2");
    }

    public static void main(String args[]){
        overload1(5.0,5);
        System.out.println("hello");

    }
}
