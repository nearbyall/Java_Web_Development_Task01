package com.epam.jwd.subtask5.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void findDivisorsSumTest() {
		
		int[] actualNumber = {12, 11, 0, -9, 414};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.findDivisorsSum(actualNumber[i]);
		}
		
		int[] expectedNumber = {16, 1, 0, 4, 522};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i]);
		}
		
	}

	@Test
	public void isPerfectNumberTest() {
		
		int[] actualNumber = {6, 28, 496, 1, -7};
		boolean[] actualBoolean = {false, false, false, false, false};
		for (int i = 0; i < actualNumber.length; i++) {
			actualBoolean[i] = Main.isPerfectNumber(actualNumber[i]);
		}
		
		boolean[] expectedBoolean = {true, true, true, false, false};
		for (int i = 0; i < actualBoolean.length; i++) {
			assertEquals(expectedBoolean[i], actualBoolean[i]);
		}
		
	}
	
}
