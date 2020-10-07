public class Ifelse {
    public static void main(String[] args) {
        int a=3;
        int b=3;
        int c=3;
        if(a>b&&a>c) {
            System.out.println("a is biggest number");
        }
       else if(b>a&&b>c){
           System.out.println("b is biggest number");
        }
        else if(c>a&&c>b){
            System.out.println("c is biggest number");
        }
        else if(a==c && a==b )
        {
            System.out.println("All are same");
        }
        else if (a == b)
        {
            System.out.println(" a and b is same");
        } else if (a==c)
        {
            System.out.println("a and c is same");
        }
        else if(b==c)
        {
            System.out.println("b and c is same");
        }
    }
}