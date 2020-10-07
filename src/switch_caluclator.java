/**
 * Created by vignesh on 06/10/20.
 */
public class switch_caluclator {
    public static void calculator(double a, double b) {
        String operation="division";
        switch (operation) {
            case "Addition":
                System.out.println("Addition of two number is:" + (a + b));
                break;
            case "Subtration":
                System.out.println("substraction of two number is:" + (a - b));
                break;
            case "division":
                System.out.println("division of two number is:" + (a / b));
                break;
            default:
                System.out.println("Not performed any operation");
                break;
        }
    }
    public static void main(String[] args) {
        switch_caluclator.calculator(4,9);
    }
}