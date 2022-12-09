package com.rayhan;

import javax.swing.*;
//import javax.swing.ImageIcon;

public class swing {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hello");
        //JOptionPane.showMessageDialog(null, "This is test", "Test",JOptionPane.INFORMATION_MESSAGE);// messege type == কি ধরণের আইকন শো করবে তা বলে।
        ImageIcon pic = new ImageIcon("test.png");

        JOptionPane.showMessageDialog(null, "dfdf", "redgred", 3, pic);
    }
}
