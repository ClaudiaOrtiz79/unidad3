import java.util.Scanner;
class Example25 {
    public static void main(String[] args) {
        int num=1;
        System.out.println(" Enter a number: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num+ "+" +i+ "=" + (num*i));
        }
    }
}