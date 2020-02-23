package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;
import java.time.Month;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLOutput;


public class Main {

    static Scanner scanner =  new Scanner(System.in);
    static Scanner scannerForNums=  new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    public static void task1(){
        System.out.println("\n1.Приветствовать любого пользователя при вводе его имени через командную строку.");

        System.out.print("Введите свое имя: ");
        String userName = scanner.nextLine();
        System.out.println("Здравствуйте, " + userName );
    }

    public static void task2(){
        System.out.println("\n2.Отобразить в окне консоли аргументы командной строки в обратном порядке.");

        System.out.print("Напишите любое слово/предложение и т.п.: ");
        StringBuffer buffer = new StringBuffer(scanner.nextLine());
        System.out.println(buffer.reverse());
    }

    public static void task3(){
        System.out.println("\n3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку");

        System.out.print("Введите кол-во чисел: ");
        int x = scannerForNums.nextInt();
        Random random = new Random();
        for ( int i = 1; i < x+1; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
    }

    public static void task4() {
        System.out.println("\n\n4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");

        System.out.println("Введите числа через пробел: ");

        String numbers = scanner.nextLine();

        boolean navsyakyi =  numbers.contains(" ") ? true : false;
        if (!navsyakyi){
            System.out.println("Вы ввели одну цифру или слово, так что сумма равняется тому, что вы ввели: " + numbers);
        }
        else{
            String[] numArray = numbers.split("[ ]");
            int sum = 0;
            for (int i = 0; i < numArray.length; i++)
                sum+=Integer.parseInt(numArray[i]);

            System.out.println("Сумма чисел: " + sum);
        }
    }

    public static void task5(){
        System.out.println("\n5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
        System.out.print("Введите число от 1 до 12: ");

        int month = scannerForNums.nextInt();
        System.out.println(month > 0 && month < 13 ? Month.of(month) : "Цифра не соответствует месяцу");
    }
}