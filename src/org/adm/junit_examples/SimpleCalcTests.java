package org.adm.junit_examples;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleCalcTests {

	@Test
	public void testAdd() {
		assertEquals(4, SimpleCalculator.Add(2, 2), 0);
	}

	@Test (timeout=2000)
	public void testSub() {
		while(true){
			assertTrue(0 == SimpleCalculator.Sub(2, 2));
		}
	}

	@Test
	@Ignore
	public void testMult() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		fail("Not yet implemented");
	}

}
