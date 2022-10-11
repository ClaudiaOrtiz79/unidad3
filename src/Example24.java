import java.util.Scanner;
public class Example24 {
    public static void main(String[] args) {
        int factorial = 1;
        int num = 0;
        System.out.print("Enter number:  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        factorial=num;
        for (int i = 1; i <=num; i++) {
            factorial = factorial * i;
        }
        System.out.println(" El factorial de: "+num+" es: "+factorial);
    }
}

