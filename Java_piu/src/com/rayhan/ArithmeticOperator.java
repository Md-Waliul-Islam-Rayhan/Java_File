package com.rayhan;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1, num2;
        float result;

        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("Sum =" + result);
        result = num1 - num2;
        System.out.println("Sub =" + result);
        result = num1 * num2;
        System.out.println("Mul =" + result);
        result = (float) num1 / num2;
        System.out.println("Div =" + result);
        result = num1 % num2;
        System.out.println("Mod =" + result);
input.close();
    }
}