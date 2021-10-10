package com.epam.jwd.scanner;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Класс реализующий ввод различных данных из консоли
 * @author Vladislav Melnikov
 */
public final class DataScanner {

    private static Scanner scanner = new Scanner(System.in);

    private DataScanner() {}
    
    public static int enterIntFromConsole() {

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt();

    }

    public static double enterDoubleFromConsole() {

        while (!scanner.hasNextDouble()) {
            scanner.next();
        }

        return scanner.nextDouble();

    }

    public static double enterAbsDoubleFromConsole() {

        while (!scanner.hasNextDouble()) {
            scanner.next();
        }

        return Math.abs(scanner.nextDouble());

    }

    public static int enterNaturalFromConsole() {

    	int a = 0;
    	
    	while (a < 1) {
    		while (!scanner.hasNextInt()) {
                scanner.next();
            }
    		a = scanner.nextInt();
    	}

        return a;

    }
    
    public static int enterYearFromConsole() {

        Pattern pattern = Pattern.compile("\\d{4}");

        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
        }

        return Integer.parseInt(scanner.nextLine());

    }

    public static int enterMonthFromConsole() {

        Pattern pattern = Pattern.compile("(\\d|1[0-2])");

        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
        }

        return Integer.parseInt(scanner.nextLine());

    }

    public static int enterSecondOfDayFromConsole() {

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt() % 86401;

    }

}
