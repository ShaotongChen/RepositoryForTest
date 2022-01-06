package com.shaotong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseExample {

	UnitTesting1 u = new UnitTesting1();
	@Test
	public void testConvertCase1() {
		assertEquals(u.cal(100), 10);
		
	}
	@Test
	public void testConvertCase2() {
		assertEquals(u.cal(10), 10);
		
	}
}
