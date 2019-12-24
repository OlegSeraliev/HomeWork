package ru.geekbrains;

import java.util.Scanner;

public class ThirdLesson {

    private static void guessNumber() {

        int GuessedNum = (int) (Math.random() * 9.9);
        Scanner sc = new Scanner(System.in);
        int InputNum;
        System.out.println("Число загадано");

        for (int i = 0; i < 3; i++) {
            System.out.printf("\nПопытка %d из 3\nВведите загаданное число: \n",i+1);
            InputNum = sc.nextInt();

            if (GuessedNum == InputNum) {
                System.out.println("Вы угадали!");
                //sc.close();
                return;

            }

        }
        System.out.println("Вы не угадали");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int RepeatGame = 0;
        System.out.println("Сыграем в игру \"Угадай число от 0 до 9\"");
        do {
            guessNumber();
            System.out.println("Повторить игру ещё раз?\n1 - да / 0 - нет");
            RepeatGame = sc.nextInt();
        } while (RepeatGame == 1);

    }

}
