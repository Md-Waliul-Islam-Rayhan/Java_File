package com.rayhan;

public class Temp {
    public static void main(String[] args) {
        int num, i = 0;
        String s = "";

        for (i = 2; i <= 50000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 0 to 100 : \n" + s);
    }
}
