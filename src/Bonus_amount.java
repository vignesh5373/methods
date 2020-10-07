/**
 * Created by vignesh on 07/10/20.
 */
public class Bonus_amount {

    public static void bonus()
    {
        int salary=50000;
        char grade ='B';
        switch (grade)
        {
            case 'A':salary:
                System.out.println("Bonus amount is:"+salary/10);
                break;
            case 'B':salary:
                System.out.println("Bonus amount is:"+salary/5);
                break;
            case'C':salary:
                System.out.println("Bonus amount is:"+salary/2);
                break;

            default:
                System.out.println("Bonus amount is:"+3000);


        }
    }
    public static void main(String[] args) {

        Bonus_amount.bonus();
    }
}
