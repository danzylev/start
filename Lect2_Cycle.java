package com.company;

public class Lect2_Cycle {

    public static void main(String[] args) {
        System.out.println("Занятие №2. Циклы.");
        //Первый модуль. Выдает на экран "HelloWorld!!!"
        Lect2_Cycle.task1();
        Lect2_Cycle.task2();
        Lect2_Cycle.task3();
        Lect2_Cycle.task4();
        Lect2_Cycle.task5();
    }

    public static void task1() {
        /*
        1) Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        */
        System.out.println("Циклы 1");
        int n = 1000;
        while ( n < 10000 ) {
            System.out.println(n + " ");
            n = n + 3;
        }

    }
    public static void task2() {

        /*
        2) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        */
        System.out.println("Циклы 2");

        int x = 1;
        for (int n = 1; n <= 55; n++)
        {
            System.out.println(x);
            x = x + 2;
        }
    }
    public static void task3() {

        /*
        3) Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        */
        System.out.println("Циклы 3");
        int x = 90;

        do {
            System.out.println(x);
            x = x - 5;
        }
        while (x >= 0);
    }

    public static void task4() {

        /*
        4) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        */
        System.out.println("Циклы 2");

        int x = 1;
        for (int n = 1; n <= 20; n++)
        {
            System.out.println(x);
            x = x * 2;
        }
    }
    public static void task5(){

        int a = 5;
        int b = 1;
        System.out.print("Введите число: ");
        //System.in.read(byte a);
        for (int c = 1; c <= a; c++){
            b = b * c;
        }
        System.out.println("Факториал введенного числа " + a + " равен " + b);
    }
}


