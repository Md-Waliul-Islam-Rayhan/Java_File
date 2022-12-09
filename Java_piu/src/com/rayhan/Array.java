package com.rayhan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(100);
        number.add(1);
        number.add(165);
        number.add(1658);
        number.add(3, 65454);


        Collections.sort(number);
        Collections.reverse(number);

        for (int x : number) {
            System.out.println(x);
        }

    }

}
