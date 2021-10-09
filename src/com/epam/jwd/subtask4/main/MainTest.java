package com.epam.jwd.subtask4.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void isEvenNumberTest() {
		
		int[] actualNumber = {12, 11, 0, -9, 414};
		boolean[] actualBoolean = {false, false, false, false, false};
		for (int i = 0; i < actualNumber.length; i++) {
			actualBoolean[i] = Main.isEvenNumber(actualNumber[i]);
		}
		
		boolean[] expectedBoolean = {true, false, true, false, true};
		for (int i = 0; i < actualBoolean.length; i++) {
			assertEquals(expectedBoolean[i], actualBoolean[i]);
		}
		
	}
	
	@Test
	public void areThereTwoEvenNumbers() {
		
		int[][] actualNumber = {{12,31,41,12}, {0,-9,21,17}};
		boolean[] actualBoolean = {false, false};
		for (int i = 0; i < actualNumber.length; i++) {
			int a = actualNumber[i][0];
			int b = actualNumber[i][1];
			int c = actualNumber[i][2];
			int d = actualNumber[i][3];
			actualBoolean[i] = Main.areThereTwoEvenNumbers(a, b, c, d);
		}
		
		boolean[] expectedBoolean = {true, false};
		for (int i = 0; i < actualBoolean.length; i++) {
			assertEquals(expectedBoolean[i], actualBoolean[i]);
		}
		
	}

}
