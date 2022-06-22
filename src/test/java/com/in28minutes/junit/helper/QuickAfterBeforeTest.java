package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickAfterBeforeTest {

	
	@Test
	public void test1() {
		System.out.println("test_1 executed");
	}
	@Test
	public void test2() {
		System.out.println("test_2 executed");
	}
	@Before
	public void before1() {
		System.out.println("before executed");
	}
	@After
	public void after() {
		System.out.println("After executed");
	}
	@BeforeClass
	public static void something()
	{
		System.out.println("Before Class executed");
	}
	@AfterClass
	public static void hjh()
	{
		System.out.println("after Class executed");
	}
}
