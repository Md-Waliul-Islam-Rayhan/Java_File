package com.rayhan;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double x, y;

        Scanner input = new Scanner(System.in);

        x= input.nextDouble();
        y= input.nextDouble();

        System.out.println("Maximum number of x and y is: " + Math.max(x, y));
        System.out.println("Square root of y is: " + Math.sqrt(y));
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        System.out.println("return the logarithm of log10 of x is: " + Math.log10(x));
    }

}
