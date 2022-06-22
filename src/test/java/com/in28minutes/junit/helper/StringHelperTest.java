package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper=new StringHelper();
	@Test
	public void TesttruncateAInFirst2Positions_Condition1() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void TesttruncateAInFirst2Positions_Condition2() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() 
	{
		
		assertFalse( helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario()
	{
		
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
		System.out.println("srikanth");
		
	}

}
