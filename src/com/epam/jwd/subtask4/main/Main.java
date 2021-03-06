package com.epam.jwd.subtask4.main;

import com.epam.jwd.scanner.DataScanner;

/**
 * Задание:
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 * @author Vladislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите 4 целых числа: ");
        int a = DataScanner.enterIntFromConsole();
        int b = DataScanner.enterIntFromConsole();
        int c = DataScanner.enterIntFromConsole();
        int d = DataScanner.enterIntFromConsole();
        System.out.println(areThereTwoEvenNumbers(a, b, c, d));

    }

    /**
     * Проверяет, является ли заданное целое число четным
     * @param a заданное целое чесло
     * @return true если число четное
     *         false если число нечетное
     */
    public static boolean isEvenNumber(int a) {

        return a % 2 == 0;

    }
    
    /**
     * Проверяет, являются ли хотя бы два числа из заданных четырех четными
     * @param a, b, c, d заданные целые числа
     * @return true если среди заданных чисел как минимум двое четные
     * 		   false если среди заданных чисел менее двух четные
     */
    public static boolean areThereTwoEvenNumbers(int a, int b, int c, int d) {
    	
    	return (isEvenNumber(a) && isEvenNumber(b))
            || (isEvenNumber(a) && isEvenNumber(c))
            || (isEvenNumber(a) && isEvenNumber(d))
            || (isEvenNumber(b) && isEvenNumber(c))
            || (isEvenNumber(b) && isEvenNumber(d))
            || (isEvenNumber(c) && isEvenNumber(d));
    	
    }

}
