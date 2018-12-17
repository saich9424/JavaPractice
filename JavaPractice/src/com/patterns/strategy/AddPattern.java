/**
 * 
 */
package com.patterns.strategy;

/**
 * @author saich
 *
 */
public class AddPattern implements StrategyInterface {

	/* (non-Javadoc)
	 * @see patterns.StrategyInterface#operation(int, int)
	 */
	@Override
	public int operation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	

}
