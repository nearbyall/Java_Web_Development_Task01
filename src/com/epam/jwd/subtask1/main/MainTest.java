package com.epam.jwd.subtask1.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void lastDigitOfNumberTest() {
		
		int[] actual = {14, 100, 19, 0, -8, 33};
		for (int i = 0; i < actual.length; i++) {
			actual[i] = Main.lastDigitOfNumber(actual[i]);
		}
		
		int[] expected = {4, 0, 9, 0, 8, 3};
		for (int i = 0; i < actual.length; i++) {
			assertEquals(expected[i], actual[i]);
		}
		
	}
	
	@Test
	public void lastDigitOfSquaredNumberTest() {
		
		int[] actual = {14, 100, 19, 0, -8, 33, 21, 17, 2, 6};
		for (int i = 0; i < actual.length; i++) {
			actual[i] = Main.lastDigitOfSquaredNumber(actual[i]);
		}
		
		int[] expected = {6, 0, 1, 0, 4, 9, 1, 9, 4, 6};
		for (int i = 0; i < actual.length; i++) {
			assertEquals(expected[i], actual[i]);
		}
		
	}

}
