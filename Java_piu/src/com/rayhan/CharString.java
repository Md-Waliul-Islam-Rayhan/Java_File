package com.rayhan;

import java.util.Scanner;

public class CharString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println("Here is =" + s);
        char c = input.next().charAt(2);

        System.out.println("Is =" + c);
        input.close();
    }
}
