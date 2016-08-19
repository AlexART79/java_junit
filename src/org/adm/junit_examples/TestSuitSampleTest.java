package org.adm.junit_examples;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestSuitSampleTest extends TestCase {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite(TestSuitSampleTest.class.getName());

        for (int i = 0; i < 10; i++) {              
        	suite.addTestSuite(SimpleCalcTestCase.class);             
        }

        return suite;
    }
}

