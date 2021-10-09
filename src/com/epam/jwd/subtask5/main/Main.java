package com.epam.jwd.subtask5.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
 * числу).
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите любое натуральное число: ");
        int a = DataScanner.enterNaturalFromConsole();
        System.out.println(isPerfectNumber(a));

    }

    /**
     * Проверяет, является ли заданное целое число совершенным числом
     * @param a заданное целое число
     * @return true если число является совершенным
     *         false если число не является совершенным
     */
    public static boolean isPerfectNumber(int a) {

        return findDivisorsSum(a) == a;

    }

    /**
     * Находит сумму всех собственных делителей заданного целого числа
     * @param a заданное целое число
     * @return сумма всех собственных делителей заданного целого числа
     */
    public static int findDivisorsSum(int a) {

        int sum = 0;

        for (int i = 1; i < Math.abs(a); i++) {
            if (a % i == 0) {
                sum += i;
            }
        }

        return sum;

    }

}
