package com.revautre.tests;

import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.day5.Calculator;
import com.revature.day5.MathApplication;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTests {
	@Mock
	private Calculator calc;

	@InjectMocks
	private final MathApplication ma = new MathApplication();

	@BeforeClass
	public static void beforeEverything() {
		System.out.println("runs once before all tests");
	}

	@Before
	public void beforeEach() {
		System.out.println("runs once before each and every test");
	}

	@Test
	public void advancedCalculationTestOne() {
		System.out.println("first test");
		when(calc.add(1, 1)).thenReturn(2d);
		when(calc.pow(2, 1)).thenReturn(2d);
		double result = ma.someAdvancedCalculation(1, 1, 1);
		System.out.println(result);
		Assert.assertEquals(2, result, 0);
	}

	@Test
	public void advancedCalculationTestTwo() {
		System.out.println("second test");
		when(calc.add(4,3)).thenReturn(7d);
		when(calc.pow(7, 2)).thenReturn(49d);
		double result = ma.someAdvancedCalculation(4, 3, 2);
		Assert.assertEquals(49, result, 0);
	}

	@After
	public void afterEach() {
		System.out.println("runs once after each and every test");
	}

	@AfterClass
	public static void afterAll() {
		System.out.println("runs once afer all tests have been run");
	}

}
