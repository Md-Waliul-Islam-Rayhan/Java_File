import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Addition: "+ (num1+num2));
        System.out.println("Subtraction: "+ (num1-num2));
        System.out.println("Multiplication: "+ (num1*num2));
        System.out.println("Division: "+ (num1/num2));
    }
}
