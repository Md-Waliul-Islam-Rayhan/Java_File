package com.rayhan;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FastFood fastFood= new FastFood();
        fastFood.create();
        //Dynamic binding
        FastFood pza= new Pizza();
        pza.create();


        JOptionPane.showMessageDialog(null,"ghfhfhfh");
    }
}
