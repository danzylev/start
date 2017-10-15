package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Lect2_Cycle_part2 {

    public static void main(String[] args) {
        System.out.println("Занятие №2. Циклы. Часть вторая c 8й задачи");
        //Первый модуль. Выдает на экран "HelloWorld!!!"

        Lect2_Cycle_part2.task8();
    }
    public static void task8(){
        /*
        8) Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены
        последовательности равны единицам, а каждый следующий — сумме двух предыдущих.         */
        System.out.println("Задача по циклам №8");
        int f[]= new int[11];
          f[0] = 1; //задаем первые 2 числа массива
          f[1] = 1;
          System.out.print("Первые 11 чисел Фибоначчи: " + f[0] + " " + f[1]);
          for (int i = 2; i <= f.length; i++){
              f[i] = f[(i-2)] + f[(i-1)]; //считаем каждый последующий элемент массива и выводим на экран
              System.out.print(" " + f[i]);
              }
    }
}
