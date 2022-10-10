import java.util.Scanner;

class Example7 {
    public static void main(String[] args) {
        double nauticalMiles;
        double nauticalMeters;
        System.out.println("Enter the distance nautical in miles:" );

        Scanner inputValue = new Scanner(System.in);
        nauticalMiles= inputValue.nextDouble();
        nauticalMeters= nauticalMiles*1852;
        System.out.println("The distance nautical in meters is: " + nauticalMeters);
    }
}
