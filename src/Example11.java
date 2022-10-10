import java.util.Scanner;
class Example11 {
    //Reading two values and sorting in ascending order
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Enter first number:  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        System.out.println("Enter second number"  );
        num2 = inputValue.nextInt();
        if (num1 < num2) {
            System.out.println("The ascendent orden is:");
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);

        }
    }
}