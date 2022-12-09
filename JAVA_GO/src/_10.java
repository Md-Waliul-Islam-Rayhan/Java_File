//P=principal amount

//T=time

//R=rate

//SI=simple interest

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal (amount), time, and rate::\n");

        float p = in.nextFloat(); // value of the principal
        float t = in.nextFloat(); // value of the time
        float r = in.nextFloat(); // value of the rate
        float SI; // value of the simple interest

        // It will calculate the simple interest
        SI = (p * t * r) / 100;

        // It will produce the final output
        System.out.println("\nSimple Interest = " + SI);
    }
}
