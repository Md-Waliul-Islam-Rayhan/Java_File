//P=principal amount

//T=time

//R=rate

//CI=Compound interest

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal (amount), time, and rate::\n");

        float p = in.nextFloat();
        float t = in.nextFloat();
        float r = in.nextFloat();
        float CI;

        // Calculate compound interest
        CI = (float)(p * (Math.pow((1 + r / 100), t)));

        // Output
        System.out.println("\nCompound Interest = " + CI);
    }
}
