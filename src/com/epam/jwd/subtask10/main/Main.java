package com.epam.jwd.subtask10.main;

import com.epam.jwd.scanner.DataScanner;

import java.util.Map;
import java.util.TreeMap;

/**
 * Задание:
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
 * представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
 * значения функции.
 * F(x) = tg(x)
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите значения границ числового диапазона [a,b]: ");
        double a = 0, b = 0;
        do {
            a = DataScanner.enterDoubleFromConsole();
            b = DataScanner.enterDoubleFromConsole();
        } while (a > b); //Необходимо проверить правильность введенных границ

        System.out.println("Введите значение шага h: ");
        double h = 0;
        do {
            h = DataScanner.enterDoubleFromConsole();
        } while (h > (b - a)); //Необходимо проверить корректность введенного шага

        Map<Double, Double> map = findFunctionValuesInInterval(a, b, h);

        printValueTable(map);

    }

    /**
     * Нахождение значения функции из заданного аргумента
     * @param x аргумент функции
     * @return значение функции
     */
    public static double findFunctionValue(double x) {

        return Math.tan(x);

    }

    /**
     * Нахождение значений функции на заданном числовом диапазон [a,b] с заданными шагом h
     * @param a нижняя граница числового диапазона
     * @param b верхняя граница числового диапазона
     * @param h шаг вычисления
     * @return ссылка на коллекцию TreeMap<Double, Double>, ключем которой является аргумент функции,
     * а значением является результат вычисления функции
     */
    public static Map<Double, Double> findFunctionValuesInInterval(double a, double b, double h) {

        Map<Double, Double> map = new TreeMap<Double, Double>();

        for (double x = a; x <= b; x += h) {
            map.put(x, findFunctionValue(x));
        }

        return map;

    }

    /**
     * Выводит в консоль таблицу состоящую из аргументов и соответствующих им значений функций
     * @param map Контейнер Map<Double, Double>, ключем которого является аргумент функции,
     * а значением является результат вычисления функции
     */
    public static void printValueTable(Map<Double, Double> map) {

        System.out.printf("| %10c | %10c |", 'x', 'y');
        for (Map.Entry<Double, Double> entry: map.entrySet()) {
            System.out.printf("\n| %10f | %10f |" , entry.getKey(), entry.getValue());
        }
        
    }

}
