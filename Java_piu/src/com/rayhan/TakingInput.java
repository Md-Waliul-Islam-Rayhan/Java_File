package com.rayhan;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("Number =" + num);
        input.close();
    }
}
