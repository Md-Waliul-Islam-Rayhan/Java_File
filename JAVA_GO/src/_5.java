import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        float radius;

        // Create scanner class object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        radius = in.nextFloat();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
