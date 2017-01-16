package org.apache.maven.plugins.maven_compiler_plugin;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
Calculator calculator=new Calculator();
@Test 
public void testCaseFindMax()
{
	int result=calculator.findMax(3,4,5);
	assertEquals(5,result);
}
@Test 
public void testCaseFindMaxNegativeNumber()
{
	int result=calculator.findMax(-3,-4,-5);
	assertEquals(5,result);
}
@Test
public void testCaseSquare()
{
	int result=calculator.square(2);
	assertEquals(4,result);
}
@Test
public void testCaseCube()
{
	int result=calculator.cube(2);
	assertEquals(8,result);
}


}
