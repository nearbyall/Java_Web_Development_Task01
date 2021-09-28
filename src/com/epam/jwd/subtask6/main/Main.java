package com.epam.jwd.subtask6.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
 * моменту.
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите n-ую секунду суток: ");
        int a = DataScanner.enterSecondOfDayFromConsole();
        System.out.printf("Полных часов: %d\n" +
                "Полных минут: %d\n" +
                "Полных секунд: %d\n",
                getHours(a), getMinutes(a), a);

    }

    /**
     * Нахождение полного кол-ва минут от общего кол-ва секунд
     * @param a заданное кол-во секунд
     * @return полное кол-во минут
     */
    public static int getMinutes(int a) {

        return a / 60;

    }

    /**
     * Нахождение полного кол-ва часов от общего кол-ва секунд
     * @param a заданное кол-во секунд
     * @return полное кол-во часов
     */
    public static int getHours(int a) {

        return (a / 60) / 60;

    }

}
