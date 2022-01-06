package com.shaotong;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaseConvertTest {

	CaseConvert cc= new  CaseConvert();
	@Test
	public void test() {
		assertEquals(cc.convertCase("hello"), "HELLO");
	}
	@Test
	public void test1() {
		assertEquals(cc.convertCase("see"), "SEE");
	}
	@Test
	public void test2() {
		assertEquals(cc.convertCase("0"), "0");
	}
	@Test
	public void test3() {
		assertEquals(cc.convertCase(""), "");
	}
	@Test
	public void test4() {
		assertEquals(cc.convertCase(null), "");
	}
}
