package com.epam.jwd.subtask9.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
 * @author  Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите радиус окружности и круга: ");
        double r = DataScanner.enterAbsDoubleFromConsole();
        double circleLength = calculateCircleLenth(r);
        double circleArea =  calculateCircleArea(r);
        System.out.printf("Длина окружности : %.2f\n" +
                          "Площадь круга: %.2f\n",
                          circleLength, circleArea);

    }

    /**
     * Вычисление площади круга из заданного радиуса
     * @param r радиус круга
     * @return площадь круга
     */
    public static double calculateCircleArea(double r) {

        return Math.PI * Math.pow(r, 2);

    }

    /**
     * Вычисление длины окружности из заданного радиуса
     * @param r радиус окружности
     * @return длина окружности
     */
    public static double calculateCircleLenth(double r) {

        return 2 * Math.PI * r;

    }

}
