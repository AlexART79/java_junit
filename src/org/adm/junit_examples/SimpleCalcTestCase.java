package org.adm.junit_examples;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class SimpleCalcTestCase extends TestCase {

	@Test
	public void test() {
		System.out.println("testAdd");
		assertEquals(4, SimpleCalculator.Add(2, 2), 0);
	}

}
