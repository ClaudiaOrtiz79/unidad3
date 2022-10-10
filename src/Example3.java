import java.util.Scanner;

class Example3 {
    public static void main(String[] args) {
        float x;
        float squareArea;
        System.out.println("Enter the side");

        //Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        squareArea = x * x ;
        System.out.println(squareArea);
    }
}
