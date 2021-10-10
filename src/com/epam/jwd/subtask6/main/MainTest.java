package com.epam.jwd.subtask6.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void findMinutesBySecondsTest() {
		
		int[] actualNumber = {1442, 7000, 0, 13, 871, 33};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.findMinutesBySeconds(actualNumber[i]);
		}
		
		int[] expectedNumber = {24, 116, 0, 0, 14, 0};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i]);
		}
		
	}

	@Test
	public void findHoursBySecondsTest() {
		
		int[] actualNumber = {11442, 7000, 0, 13, 8871, 33};
		for (int i = 0; i < actualNumber.length; i++) {
			actualNumber[i] = Main.findHoursBySeconds(actualNumber[i]);
		}
		
		int[] expectedNumber = {3, 1, 0, 0, 2, 0};
		for (int i = 0; i < actualNumber.length; i++) {
			assertEquals(expectedNumber[i], actualNumber[i]);
		}
		
	}
	
}
