import java.util.Scanner;
 class Example29 {
     public static void main(String[] args) {
         int num1; //Dividendo
         int num2; //Divisor
         Scanner inputValue;
         System.out.println("Introduce el dividendo: ");
         inputValue = new Scanner (System.in);
         num1= inputValue.nextInt();
         System.out.println("Introduce el divisor: ");
         inputValue = new Scanner (System.in);
         num2= inputValue.nextInt();

         while (num1 >= num2) {
             num1 = num1 - num2;
         }
         System.out.println("El resto de la division es: " +num1);
     }
}
