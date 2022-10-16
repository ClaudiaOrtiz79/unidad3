import java.util.Scanner;

class Example31 {
    public static void main(String[] args) {
        int num;
        int i = 1;
        Scanner inputValue;
        System.out.print("Enter the number: ");
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        while (i <= num) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x + "\t");
            }
            i++;
            System.out.println();
        }
    }
}