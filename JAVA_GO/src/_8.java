import java.util.Scanner;

public class _8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Input temperature in Fahrenheit from user */
        System.out.print("Enter temperature in Fahrenheit: ");
        float F = in.nextFloat();

        /* Convert Fahrenheit to Celsius */
        float C = (F - 32) * (9f / 5);

        /* Print temperature in Celsius */
        System.out.println(F + " degree Fahrenheit is equal to " + C + " degree Celsius.");
    }
}
