import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        double celsius, fahren;
        Scanner scanner = new Scanner(System.in);

        // Take temperature in Celsius as input from user
        System.out.print("Enter Temperature in Celsius: ");
        celsius = scanner.nextFloat();

        fahren = (9.0 / 5.0) * celsius + 32;

        System.out.print("Temperature in Fahrenheit = " + fahren);
    }
}
