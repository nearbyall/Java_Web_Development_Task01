package com.epam.jwd.subtask8.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Вычислить значение функции:
 * -x^2+3x+9, если x>=3
 * 1/(x^3-6), если x<3
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите значение аргумента x функции: ");

        //В контексте конкретно этой задачи может произойти деление на ноль
        double x = 0;
        do {
            x = DataScanner.enterDoubleFromConsole();
        } while (x == Math.pow(6, 1/3)); // Необходимо проверить, произойдет ли деление на ноль

        double f = findFunctionValue(x);

        System.out.printf("Значение функции для заданного аргумента: %.3f", f);

    }

    /**
     * Нахождение значения функции от заданного вещественного аргумента
     * @param x значение аргумента
     * @return значение функции
     */
    public static double findFunctionValue(double x) {

        if (x >= 3) {
            return -Math.pow(x, 2) + 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) - 6);
        }

    }

}
