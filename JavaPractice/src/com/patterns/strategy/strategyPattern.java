/**
 * 
 */
package com.patterns.strategy;

/**
 * @author saich
 *
 */

public class strategyPattern {
	
	public static void main (String args[])
	{
		Context cxt= new Context();
		cxt.setStarategy(new SubtractPattern());
		int result =cxt.operations(5, 6);
		System.out.println(result);
	}
	


}
