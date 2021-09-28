package com.epam.jwd.subtask1.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        int a = lastDigitOfSquaredNumber(DataScanner.enterIntFromConsole());
        System.out.printf("Последняя цифра квадрата заданного числа: %d", a);

    }

    /**
     * Возвращает последнюю цифру заданного числа
     * @param a число, последнюю цифру которого необходимо извлечь
     * @return последняя цифра заданного числа
     */
    public static int lastDigitOfNumber(int a) {
        return Math.abs(a) % 10;
    }

    /**
     * Возвращает последнюю цифру квадрата заданного числа, отталкиваясь
     * от последней цифры исходного числа
     * @param a число, последнюю цифру квадрата которого необходимо извлечь
     * @return последняя цифра заданного числа
     */
    public static int lastDigitOfSquaredNumber(int a) {

        int lastDigit = lastDigitOfNumber(a);

        switch (lastDigit) {
            case 1, 9:
                return 1;
            case 2, 8:
                return 4;
            case 3, 7:
                return 9;
            case 4:
                return 6;
            case 5:
                return 5;
            default:
                return 0;
        }

    }

}
