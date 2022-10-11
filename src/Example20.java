import java.util.Scanner;
class Example20 {
    public static void main(String[] argv) {
        int year;
        System.out.print(" Enter the year: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        year = inputValue.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Es bisiesto");

        } else {

            System.out.println("No es bisiesto");
        }
    }
}
