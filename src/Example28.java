import java.util.Scanner;
 class Example28 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum= 0;
        Scanner inputValue;
        System.out.print("Enter first number:  ");
        inputValue = new Scanner(System.in);
        num1 = inputValue.nextInt();
        System.out.print("Enter first number:  ");
        num2 = inputValue.nextInt();
        for (int i = 1; i <=num2; i++) {
            sum = sum + num1;
        }
        System.out.println(" The product is: " + sum);
    }
}

