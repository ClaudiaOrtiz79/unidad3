import java.util.Scanner;

public class Example33 {
    public static void main(String[] args) {

        Scanner inputValue;
        System.out.print(" Enter a number: ");
        inputValue = new Scanner(System.in);
        double n = inputValue.nextDouble();
        double x;
        double y;
        x = n;
        for (int i = 1; i <= 0.000001; i++) {
                y = (0.5) * (x + (n / x));
                x = y;
        }
        System.out.println("The square root is:  " + x);
    }
}
