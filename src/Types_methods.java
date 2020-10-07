/**
 * Created by vignesh on 30/09/20.
 */
public class Types_methods {
     public static void method1(int a){
        System.out.println("method1");
    }
    public static int method1(double b){
        System.out.println("method2");
        return (int)b;
    }

    public static void method1(int a,double b){
        System.out.println("method3");
    }
    public static int method1(){
       int  result =1;
        System.out.println("method5");
        return result;
    }

     public static void main(String[]args) {
       Types_methods.method1(15,15);

     }

    }

