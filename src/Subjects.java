/**
 * Created by vignesh on 07/10/20.
 */
public class Subjects {
    public static void main(String[] args) {
        String department = "Add";
        int year =3 ;
        switch (year) {
            case 1:
                System.out.println("Maths,english");
                break;
            case 2:
                switch(department) {
                    case "CSE":
                        System.out.println("java,Operating system,linux");
                        break;

                    case "Mech":
                        System.out.println("Maths,DSP,circuit");
                        break;
                    default:
                        System.out.println("Maths");
                }
                break;
            default:
                System.out.println("nothing");
        }
    }

}

