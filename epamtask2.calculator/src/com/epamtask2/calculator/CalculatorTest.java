/**
 * 
 */
package com.epamtask2.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Used to test Calculator application
 * @author AnirudhVeeramalla
 */
public class CalculatorTest {
    
	@Test
	public void testCalculatorAdd(){
		Calculator c=new Calculator();
		assertEquals(5.2,c.add(3.0, 2.2),0.1);
		assertEquals(-0.8,c.add(-3.0, 2.2),0.1);
		assertEquals(0,c.add(0, 0),0.1);
		assertEquals(-6,c.add(9,-15),0.1);
	}
	
	@Test
	public void testCalculatorMultiply(){
		Calculator c=new Calculator();
		assertEquals(6.6,c.multiply(3.0, 2.2),0.1);
		assertEquals(-14.58,c.multiply(-2.7, 5.4),0.1);
		assertEquals(0,c.multiply(0, 0),0.1);
		assertEquals(-135,c.multiply(9,-15),0.1);
	}
	
	@Test
	public void testCalculatorDivide(){
		Calculator c=new Calculator();
		assertEquals(1.36,c.divide(3.0, 2.2),0.1);
		assertEquals(-1.36,c.divide(-3.0, 2.2),0.1);
		assertEquals(-0.6,c.divide(9,-15),0.1);
	}
}
