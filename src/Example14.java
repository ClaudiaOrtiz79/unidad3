import java.util.Scanner;
class Example14 {
    //Leer 3 valores y ordenarlo de forma Ascendente
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introduce primer valor: ");
        num1 = reader.nextInt();
        System.out.println("Introduce segundo valor: ");
        num2 = reader.nextInt();
        System.out.println("Introduce tercer valor: ");
        num3 = reader.nextInt();
        if (num1 > num2 && num2 > num3 ) {
            System.out.println(" Orden ascendente: "+num1+ ","+num2+ ","+num3);
        }else if (num1 > num3 && num3 > num2) {
            System.out.println(" Orden ascendente: "+num1+ ","+num3+ ","+num2);
        }else if (num2 > num1 && num1 > num3) {
            System.out.println(" Orden ascendente: "+num2+ ","+num1+ ","+num3);
        }else if (num2 > num3 && num3 > num1) {
            System.out.println(" Orden ascendente: "+num2+ ","+num3+ ","+num1);
        }else if (num3 > num1 && num1 > num2) {
            System.out.println(" Orden ascendente: "+num3+ ","+num1+ ","+num2);
        }else if (num3 > num2 && num2 > num1) {
            System.out.println(" Orden ascendente: "+num3+ ","+num2+ ","+num1);
        }
    }
}
