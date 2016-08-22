package org.adm.junittests;

import org.adm.javaaut.SimpleCalculator;
import org.junit.Test;
import junit.framework.TestCase;

public class SimpleCalcTestCase extends TestCase {

	@Test
	public void test() {
		System.out.println("testAdd");
		assertEquals(4, SimpleCalculator.Add(2, 2), 0);
	}

}
