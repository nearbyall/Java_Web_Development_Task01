package com.epam.jwd.subtask1.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void lastDigitOfNumberTest() {
		
		int[] actualNumber = {14, 100, 19, 0, -8, 33};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.lastDigitOfNumber(actualNumber[i]);
		}
		
		int[] expectedNumber = {4, 0, 9, 0, 8, 3};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i]);
		}
		
	}
	
	@Test
	public void lastDigitOfSquaredNumberTest() {
		
		int[] actualNumber = {14, 100, 19, 0, -8, 33, 21, 17, 2, 6};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.lastDigitOfSquaredNumber(actualNumber[i]);
		}
		
		int[] expected = {6, 0, 1, 0, 4, 9, 1, 9, 4, 6};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expected[i], actualNumber[i]);
		}
		
	}

}
