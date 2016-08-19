package org.adm.junit_examples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SimpleCalcRepeatableTest {

	@Parameterized.Parameters(name="Iteration {index}")
    public static Collection data() {
        return Arrays.asList(new Object[10][0]);
    }
    	
	@Test
	public void testAdd() {
		assertEquals(4, SimpleCalculator.Add(2, 2), 0);		
	}

}
