import java.util.Scanner;

class Example18 {
    public static void main(String[] argv) {
        double priceperHour;
        double hours;
        double extrahours = 0;
        double grosspay;
        double netpay;
        double taxes =0;
        System.out.println("Enter the priceperHour:  ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        priceperHour = inputValue.nextDouble();

        System.out.println("Enter the hours:  ");
        hours = inputValue.nextDouble();

        if (hours <= 35) {
            extrahours = 0;

        }
            if (hours > 35) {
                extrahours = (1.5 * priceperHour) * (hours - 35);
            }
            grosspay = priceperHour * hours + extrahours;
            System.out.println(" The grosspay es: " + grosspay + "€");

            if (grosspay < 500) {
                System.out.println(" The taxes es: 0 €");
            }
            if (grosspay > 500 && grosspay <= 900) {
                taxes = 0.25 * (grosspay - 500);
            }
            if (grosspay > 900) {
                taxes = 0.45 * (grosspay - 900);
            }
            netpay = grosspay - taxes;
            System.out.println("The net pay es:  " + netpay + "€");
            System.out.println("The taxes es:  " + taxes + "€");
        }
    }


