package com.epam.jwd.subtask2.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
 * месяце и корректно определялись все високосные года.
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите год в формате XXXX: ");
        int a = DataScanner.enterYearFromConsole();
        System.out.println("Введите номер месяца, в диапазоне [1,12]: ");
        int b = DataScanner.enterMonthFromConsole();
        System.out.printf("Кол-во дней в заданном месяце: %d", daysCountByMonth(a, b));

    }

    /**
     * Возвращает значение типа boolean, зависящее от того, являетя ли год високосным
     * @param a заданный год
     * @return true если год високосный
     *         false если год не високосный
     */
    public static boolean isLeapYear(int a) {

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                return a % 400 == 0;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }

    }

    /**
     * Возвращает кол-во дней в заданном месяце заданного года
     * @param a заданный год
     * @param b заданный месяц
     * @return кол-во дней
     */
    public static int daysCountByMonth(int a, int b) {

        switch (b) {

            case 1, 3, 5, 7, 8, 10, 12:
                return 31;

            case 4, 6, 9, 11:
                return 30;

            case 2:
                if (isLeapYear(a)) {
                    return 29;
                }
                return 28;

            default:
                return 0;
        }

    }
}
