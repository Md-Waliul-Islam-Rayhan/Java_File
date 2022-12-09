import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the two angles of triangle:: ");

        int p = in.nextInt();
        int q = in.nextInt();
        int r;

        // p, q, and r is all angles of the triangle

        // Compute third angle
        r = 180 - (p + q);

        // Output
        System.out.println("\nThird angle of the triangle = " + r + "\n");
    }
}
