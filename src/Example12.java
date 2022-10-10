import java.util.Scanner;
class Example12 {
    //Reading two values and displays the biggest oh them
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1;// First Value
        int num2;// Second Value
        System.out.println("Intro first value: ");
        num1 = reader.nextInt();// Assign the value they enter
        System.out.println("Intro second value: ");
        num2 = reader.nextInt();
        if (num1 > num2) { //
            System.out.println("The number is " + num1);
        }else{
            System.out.println("The number biggest es " + num2);

        }
    }
}