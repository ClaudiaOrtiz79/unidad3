import java.util.Scanner;
public class Example27 {
    public static void main(String[] args) {
        int a=0, b=1, c;

        for (int i=0; i<40; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(a+ ",");
        }
    }
}
