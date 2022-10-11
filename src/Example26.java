import java.util.Scanner;
public class Example26 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number:  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i = 1; i <=num; i++) {
            if (num % i ==0)
                System.out.println(i + " " );
        }
    }
}