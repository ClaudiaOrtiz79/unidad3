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
            for (int y = num; y > 0; y--) {
                if (y <= i) {
                    System.out.print("\t"+ y);
                } else {
                    System.out.print(" \t/");
                }
            }
            for (int x = 2; x <= num; x++) {
                if (x <= i) {
                    System.out.print(" \t" + x);
                } else {
                    System.out.print("\t/");
                }
            }
            System.out.println();
            i++;
        }
    }
}