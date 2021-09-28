package com.epam.jwd.subtask7.logic;

import com.epam.jwd.subtask7.bean.Point;

/**
 * Класс, реализующий логику класса Point
 * @author Vladislav Melnikov
 */
public class PointLogic {
    /* Класс представляет собой Singleton */

    private static final PointLogic instance = new PointLogic();

    private PointLogic() {}

    public static PointLogic getInstance() {

        return instance;

    }

    /**
     * Нахождение значения расстояния от точки до начала координатных осей
     * @param point объект класса Point
     * @return расстояния от точки до начала координатных осей
     */
    public double getDistanceToCenter(Point point) {

        return Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));

    }

}
