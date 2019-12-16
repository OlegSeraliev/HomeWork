package ru.geekbrains;

import javax.swing.*;

public class FirstLesson {

    // #1 прописать метод main
    public static void main(String[] args) {

        System.out.println(calculate(5,7,8,4));
        System.out.println(isSumFromTenToTwenty(14,6));
        isPositiveOrNegative(15);
        System.out.println(isNegative(15));
        greetings("Вася");

        isLeanOrLeapYear(1996);
        isLeanOrLeapYear(1997);
        isLeanOrLeapYear(2000);
        isLeanOrLeapYear(2004);
        isLeanOrLeapYear(2400);

    }

    // #2 создать переменные пройденных типов данных, проинициализировать
    public static void createNInitializeVariables() {
        byte a = 127;
        short b = 1234;
        int c = 1234567;
        long d = 120000000L;
        float e = 3.14f;
        double f = -123.456;
        char g = 'g';
        boolean h = true;
    }

    // #3 метод a*(b+(c/d))
    public static int calculate(int a, int b, int c, int d) {
        int div = (int)(c/d);
        return a*(b + div);
    }

    // #4  10 < (Сумма входных параметров) <= 20
    public static boolean isSumFromTenToTwenty(int a, int b) {
        int SumParameters = a + b;
        boolean CheckRes = (SumParameters > 10 && SumParameters <=20);
        return CheckRes;
    }

    // #5  входной параметр положительное/отрицательне число
    //      вывод в консоль
    public static void isPositiveOrNegative(int param){
        if (param >= 0) {
            System.out.println("Параметр - положительное число");
        } else {
            System.out.println("Параметр - отрицательное число");
        }
    }

    // #6 входной параметр отрицательное число - возврат истина

    public static boolean isNegative(int param) {
        if (param < 0) {
            return true;
        }
        return false;
    }

    // #7 Вывод - привет, имя
    public static void greetings(String name) {
        System.out.println("Привет, " + name);
    }

    // #8 Год високосный ?

    public static void isLeanOrLeapYear(int year) {
        if ((year % 4) == 0 && (year % 100) != 0 && (year % 400) != 0) {
            System.out.println(year + " Год високосный");
        } else {
            System.out.println(year + " Год невисокосный");
        }
    }

}