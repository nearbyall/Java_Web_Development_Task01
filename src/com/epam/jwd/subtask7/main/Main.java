package com.epam.jwd.subtask7.main;

import com.epam.jwd.scanner.DataScanner;
import com.epam.jwd.subtask7.bean.Point;
import com.epam.jwd.subtask7.logic.PointLogic;

/**
 * Задание:
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
 * ближе к началу координат. x y.
 * @author VLadislav Melnikov
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите координаты x и y точки A: ");
        double x1 = DataScanner.enterDoubleFromConsole();
        double y1 = DataScanner.enterDoubleFromConsole();

        System.out.println("Введите координаты x и y точки B: ");
        double x2 = DataScanner.enterDoubleFromConsole();
        double y2 = DataScanner.enterDoubleFromConsole();

        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);

        PointLogic pointLogic = PointLogic.getInstance();

        double r1 = pointLogic.getDistanceToCenter(A);
        double r2 = pointLogic.getDistanceToCenter(B);

        if (r1 < r2) {
            System.out.println("Точка А ближе к центру");
        } else if (r1 > r2) {
            System.out.println("Точка B ближе к центру");
        } else {
            System.out.println("Точки A и B равноудалены от центра");
        }

    }

}
