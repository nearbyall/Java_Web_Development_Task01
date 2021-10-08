package com.epam.jwd.subtask3.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
 * окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите площадь описанного около окружности квадрата: ");
        double a = DataScanner.enterAbsDoubleFromConsole();
        System.out.printf("Площадь вписанного в окружность квадрата: %.2f\n"
        				+ "Площадь вписанного квадрата всегда будет в два раза меньше.",
        				a / 2);

    }

}
