package ru.geekbrains;

import java.net.StandardSocketOptions;

public class SecondLesson {


    // Метод вывода одномерного целочисленного массива в консоль
    // Всмопогательный метод
    private static void showArrayOfInt(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Вывод двумерного целочисленного массива
    private static void showTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // #1
    private static void createNReverseArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1};

        // Вывод изначального массива
        showArrayOfInt(arr);

        // Реверс элементов
        for (int i=0; i<arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    arr[i] = 1;
                    break;
                case 1:
                    arr[i] = 0;
                    break;
            };
        };

        showArrayOfInt(arr);

    }

    // #2
    private static void createArrayOfEightByThree() {

        int[] arr = new int[8];
        arr[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 3;
        };

        showArrayOfInt(arr);

    }

    // #3
    private static void createArrayLessSixMultiplyTwo() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 8, 1};
        showArrayOfInt(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 6;
            }
        };

        showArrayOfInt(arr);

    }

    // #4
    private static void createTwoDimensionalArrayNFillDiagonal() {

        int[][] array = new int[5][5];
        showTwoDimensionalArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println();
        showTwoDimensionalArray(array);

    }

    // #5
    private static void findMinMaxInArray() {

        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 8, 1};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальный элемент в массиве:\t" + min);
        System.out.println("Макисимальный элемент в массиве:\t" + max);

    }

    // #6
    private static boolean checkBalance(int[] array) {

        // Подсчет суммы элементов, проверка на четность
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (sum % 2 == 0);

    }

    // #7
    private static void moveArraysElements(int[] array, int n) {



    }

    public static void main(String[] args) {

        //createNReverseArray();
        //createArrayOfEightByThree();
        //createArrayLessSixMultiplyTwo();
        //createTwoDimensionalArrayNFillDiagonal();
        //findMinMaxInArray();

        int[] arr = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 2}));

    }

}
