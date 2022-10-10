import java.util.Scanner;
class Example15 {
    public static void main(String[] args) {
        int nota;
        System.out.println("Introduce la nota: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        nota = inputValue.nextInt();
        if (nota >= 0 && nota < 3) {
            System.out.println("Muy deficiente");
        }
        if (nota >= 3 && nota < 5) {
            System.out.println("Insuficiente");
        }
        if (nota == 5) {
            System.out.println("Suficiente");
        }
        if (nota == 6) {
            System.out.println("Bien");
        }
        if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        }
        if (nota == 9) {
            System.out.println("Notable");
        }
        if (nota == 10) {
            System.out.println("Notable");
        }
        if (nota > 10) {
            System.out.println("Error en la nota debe ser de 0 a 10");
        }
    }
}

