package com.epam.jwd.subtask8.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.epam.jwd.constant.Constant;

public class MainTest {
	
	@Test
	public void findFunctionValueTest() {

		double[] actualNumber = {10, -17, 2, 0, 7, 33};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.findFunctionValue(actualNumber[i]);
		}
		
		double[] expectedNumber = {-61.000000, -0.000203, 0.500000,
				-0.166667, -19.000000, -981.000000};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i], Constant.EPS);
		}
		
	}

}
