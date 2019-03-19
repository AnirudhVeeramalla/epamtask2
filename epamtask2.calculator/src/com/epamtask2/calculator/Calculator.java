/**
 * 
 */
package com.epamtask2.calculator;

/**
 * Simple calculator program to add,multiply and divide two numbers
 * @author AnirudhVeeramalla
 *
 */

public class Calculator {
    
	/**
	 * finds addition of two numbers
	 * @param a
	 * @param b
	 * @return addition of two double numbers
	 */
	
	public double add(double a,double b)
	{
		return a+b;
	}
	
	/**
	 * finds multiplication of two numbers
	 * @param a
	 * @param b
	 * @return multiplication of two double numbers
	 */
	
	public double multiply(double a,double b)
	{
		return a*b;
	}
	
	/**
	 * finds division of two numbers
	 * @param a
	 * @param b
	 * @return division of two numbers
	 * @throws Exception when b equals to zero
	 */
	public double divide(double a,double b)
	{
		if(b==0)
			throw new ArithmeticException("Cannot be divided with zero");
		else
			return a/b;
	}
}
