import java.util.Scanner;

public class _3 {

    public static void main(String[] args) {

        float length, width, area, perimeter;

        // Create scanner class object
        Scanner in = new Scanner(System.in);


        // Input length and width of rectangle
        System.out.print("Enter length of rectangle: ");
        length = in.nextFloat();

        System.out.print("Enter width of rectangle: ");
        width  = in.nextFloat();


        // Calculate perimeter  of rectangle
        perimeter = 2 * (length + width);

        // Calculate area of rectangle
        area = length * width;


        // Print perimeter and area of rectangle
        System.out.println("Perimeter of rectangle is " + perimeter + " units.");
        System.out.println("Area of rectangle is " + area + " sq. units.");
    }
}

