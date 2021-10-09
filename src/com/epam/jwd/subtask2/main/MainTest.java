package com.epam.jwd.subtask2.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void isLeapYearTest() {
		
		int[] actualYear = {1999, 2024, 1944, 400, 2000};
		boolean[] actualBoolean = {false, false, false, false, false};
		for (int i = 0; i < actualYear.length; i++) {
			actualBoolean[i] = Main.isLeapYear(actualYear[i]);
		}
		
		
		
		boolean[] expectedBoolean = {false, true, true, true, true};
		for (int i = 0; i < actualBoolean.length; i++) {
			assertEquals(expectedBoolean[i], actualBoolean[i]);
		}
		
	}

	@Test
	public void daysCountByMonthTest() {
		
		int[] actualYear = {1999, 2024, 1944, 400, 2000};
		int[] actualMonth = {10, 2, 12, 2, 4};
		int[] actualCount = {0, 0, 0, 0, 0};
		for (int i = 0; i < actualCount.length; i++) {
			actualCount[i] = Main.daysCountByMonth(actualYear[i], actualMonth[i]);
		}
		
		int[] expectedCount = {31, 29, 31, 29, 30};
		for (int i = 0; i < actualCount.length; i++) {
			assertEquals(expectedCount[i], actualCount[i]);
		}
		
	}
	
}
