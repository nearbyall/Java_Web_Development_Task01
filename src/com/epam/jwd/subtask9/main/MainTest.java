package com.epam.jwd.subtask9.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.epam.jwd.constant.Constant;

public class MainTest {

	@Test
	public void calculateCircleAreaTest() {
		
		double[] actualNumber = {1, 7, 8, 19, 0};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.calculateCircleArea(actualNumber[i]);
		}
		
		double[] expectedNumber = {3.141593, 153.938040,
				201.061930, 1134.114948, 0.0000000};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i], Constant.EPS);
		}
		
	}
	
	@Test
	public void calculateCircleLenthTest() {
		
		double[] actualNumber = {1, 7, 8, 19, 0};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.calculateCircleLenth(actualNumber[i]);
		}
		
		double[] expectedNumber = {6.283185, 43.982297,
				50.265482, 119.380521, 0.0000000};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i], Constant.EPS);
		}
		
	}

}
