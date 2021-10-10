package com.epam.jwd.subtask7.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.epam.jwd.constant.Constant;
import com.epam.jwd.subtask7.bean.Point;

public class PointLogicTest {
	
	@Test
	public void findDistanceToCenterTest() {
		
		PointLogic logic = PointLogic.getInstance();

        	Point[] actualPoint = {new Point(-9, 17), new Point(23, 0),
        	new Point(19, 58), new Point(-23, -23), new Point(-17, 19)};
        	double[] actualNumber = {0, 0, 0, 0, 0};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = logic.findDistanceToCenter(actualPoint[i]);
		}
		
		double[] expectedNumber = {19.235384061671343, 23.0,
				61.032778078668514, 32.526911934581186, 25.495097567963924};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i], Constant.EPS);
		}
		
	}

}
