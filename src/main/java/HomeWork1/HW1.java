package HomeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class HW1{

    public static void main(String[] args) {
//        System.out.println(isSumBetween10And20(5, 15)); // true
//        System.out.println(isSumBetween10And20(7, 15)); // false
//        System.out.println(isSumBetween10And20(2, 6)); // false
//
//        System.out.println(isPositive(5)); // true
//        System.out.println(isPositive(-3)); // false
//
//        printString("abcd", 5); // abcdabcdabcdabcdabcd

//        System.out.println(isLeapYear(2600)); // false
//        System.out.println(isLeapYear(2400)); // true
//        System.out.println(isLeapYear(1992)); // true

//        System.out.println(Arrays.toString(createArray(8, 8))); // [8, 8, 8, 8, 8, 8, 8, 8]

//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        swap0And1(arr); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

//        int[] numList = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        multiplyBy2(numList); // [2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]

        int[][] array = new int[5][5];
        fillDiagonalWith1(array);
//        fillSecondDiagonalWith1(array);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x > 0;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        System.out.println(source.repeat(repeat));
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        boolean result = true;
        if(year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) result = false;
            else result = true;
        }
        else result = false;
        return result;
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     *
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     * и числа меньшие 6 умножить на 2;
     *
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно). Определить элементы
     * одной из диагоналей можно по следующему принципу: индексы таких элементов
     * равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * Также заполнить элементы побочной диагонали
     */
    private static void swap0And1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void multiplyBy2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void fillDiagonalWith1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        };
        for (int[] item : array) System.out.println(Arrays.toString(item));
    }

    private static void fillSecondDiagonalWith1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - 1 - i] = 1;
        };
        for (int[] item : array) System.out.println(Arrays.toString(item));
    }
}
