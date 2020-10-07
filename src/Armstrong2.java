/**
 * Created by vignesh on 06/10/20.
 */
public class Armstrong2 {
    public static void main(String[] args) {


        int number = 153;
        int cube;
        int sum = 0;
        int temp=0;
        temp=temp+number;//153
        cube = temp % 10; //3
        cube = cube * cube * cube;//27
        sum = sum+cube;//27

        temp=temp/10;//15
        cube=temp%10;//5
        cube = cube * cube * cube;//125
        sum=sum+cube;//152

        temp=temp/10;//1
        sum=sum+temp;//153
if(number==sum){
    System.out.println("Value is armstrong number");

    }
    else {
    System.out.println("Value is not an armstrong number");
}
}
}
