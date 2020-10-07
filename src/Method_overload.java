/**
 * Created by vignesh on 26/09/20.
 */
public class Method_overload {

    public static double operators2(double a,double b){
        return a+b;
    }
    public static int operators2(int a)
    {
        return a;
    }
    public static double operators2(double a,double b,double c)
    {
        return a/b;
    }
    public static String operators2(String a)

    {
        return a;
    }

public static void main(String args[]){
    System.out.println(operators2(33,33));
    System.out.println(operators2(33));
    System.out.println(operators2(33,33,66));
    System.out.println(operators2("hello"));

}
}

