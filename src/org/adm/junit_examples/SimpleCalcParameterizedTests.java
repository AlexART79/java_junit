package org.adm.junit_examples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SimpleCalcParameterizedTests {

	private float x;
	private float y;
	private double res;
		
	public SimpleCalcParameterizedTests(float xVal, float yVal, double resVal) {
		this.x = xVal;
		this.y = yVal;
		this.res = resVal;
	}
	
	@Parameters(name="Add: {0} to {1} equals {2}")
	public static Collection<Object[]> CalcData() {
	      return Arrays.asList(new Object[][] {
	         { 2, 2, 4 },
	         { 1, 0, 1 },
	         { 10, -5, 5},
	         { 999, 1, 1000}
	      });
	   }	
	
	@Test
	public void testAdd() {
		assertEquals(res, SimpleCalculator.Add(x, y), 0);
	}
}
