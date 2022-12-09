package com.rayhan;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int result;

        result = num;
        System.out.println("Unary Plus =" + result);
        result = -num;
        System.out.println("Unary Minus =" + result);

    }
}
