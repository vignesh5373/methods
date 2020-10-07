/**
 * Created by vignesh on 02/10/20.
 */
public class armstrong1 {
    public static void arm(int d1,int d2,int d3){
        d1=d1*d1*d1;
        d2=d2*d2*d2;
        d3=d3*d3*d3;
        if (d1+d2+d3==153) {
            System.out.println("Value is an armstrong number ");
        }
        else{
            System.out.println("Value is not an armstrong number");
        }

    }

    public static void main(String[] args) {
        armstrong1 object=new armstrong1();
        object.arm(1,5,3);
    }
}


