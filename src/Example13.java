import java.util.Scanner;
class Example13 {
    //Reading three values and displays the biggest oh them
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Introduce primer numero: ");
        num1 = reader.nextInt();// Assign the value they enter
        System.out.println("Introduce el segundo numero: ");
        num2 = reader.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3 = reader.nextInt();
        if (num1 == num2 && num2 == num3){
            System.out.println("Todos los numeros son iguales");
        } else if (num1 > num2 && num1 > num3){
            System.out.println("El numero mayor es:"  +num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El numero mayor es:"  +num2);
        }else{
            System.out.println("El numero mayor es:"  +num3);
        }
    }
}