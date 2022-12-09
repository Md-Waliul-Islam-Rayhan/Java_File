package com.rayhan;

class part1 extends Thread {
    public void run(){
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

        System.out.println("\nPrime numbers from 0 to 50000 : \n" + s);

        System.out.println();
    }
}

class part2 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 50001; i <= 100000; i++) {
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

        System.out.println("\nPrime numbers from 50001 to 100000 : \n" + s);

        System.out.println();
    }
}

class part3 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 100001; i <= 150000; i++) {
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

        System.out.println("\nPrime numbers from 100001 to 150000 : \n" + s);

        System.out.println();
    }
}

class part4 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 150001; i <= 200000; i++) {
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

        System.out.println("\nPrime numbers from 150001 to 200000 : \n" + s);

        System.out.println();
    }
}

class part5 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 200001; i <= 250000; i++) {
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

        System.out.println("\nPrime numbers from 200001 to 250000 : \n" + s);

        System.out.println();
    }
}

class part6 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 250001; i <= 300000; i++) {
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

        System.out.println("\nPrime numbers from 250001 to 300000 : \n" + s);

        System.out.println();
    }
}

class part7 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 300001; i <= 350000; i++) {
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

        System.out.println("\nPrime numbers from 300001 to 350000 : \n" + s);

        System.out.println();
    }
}

class part8 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 350001; i <= 400000; i++) {
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

        System.out.println("\nPrime numbers from 350001 to 400000 : \n" + s);

        System.out.println();
    }
}

class part9 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 400001; i <= 450000; i++) {
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

        System.out.println("\nPrime numbers from 400001 to 450000 : \n" + s);

        System.out.println();
    }
}

class part10 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 450001; i <= 500000; i++) {
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

        System.out.println("\nPrime numbers from 450001 to 500000 : \n" + s);

        System.out.println();
    }
}

public class multi {
    public static void main(String args[])
    {
        part1 t1 = new part1();
        part2 t2 = new part2();
        part3 t3 = new part3();
        part4 t4 = new part4();
        part5 t5 = new part5();
        part6 t6 = new part6();
        part7 t7 = new part7();
        part8 t8 = new part8();
        part9 t9 = new part9();
        part10 t10 = new part10();

        Thread m1 = new Thread(t1);
        Thread m2 = new Thread(t2);
        Thread m3 = new Thread(t3);
        Thread m4 = new Thread(t4);
        Thread m5 = new Thread(t5);
        Thread m6 = new Thread(t6);
        Thread m7 = new Thread(t7);
        Thread m8 = new Thread(t8);
        Thread m9 = new Thread(t9);
        Thread m10 = new Thread(t10);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
        m7.start();
        m8.start();
        m9.start();
        m10.start();

    }
}