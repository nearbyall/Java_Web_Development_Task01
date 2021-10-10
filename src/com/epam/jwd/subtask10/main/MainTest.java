package com.epam.jwd.subtask10.main;

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
		
		double[] expectedNumber = {0.64836082745, -3.49391564547, -2.18503986326,
				0, 0.87144798272, -75.3130148001};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i], Constant.EPS);
		}
		
	}

}
