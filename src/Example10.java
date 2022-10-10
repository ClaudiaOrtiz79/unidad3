import java.util.Scanner;
class Example10 {
    public static void main(String[] args) {
        float num;
        System.out.println("Enter number:  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num = inputValue.nextFloat();
        if (num >= 0) {
            System.out.println("It is positive");
        } else {
            System.out.println("It is negative");
        }
    }
}