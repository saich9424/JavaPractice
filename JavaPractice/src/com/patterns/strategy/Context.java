/**
 * 
 */
package com.patterns.strategy;

/**
 * @author saich
 *
 */
public class Context {

	private StrategyInterface inf;
	
	public void setStarategy(StrategyInterface inf)
	{
		this.inf=inf;
	}
	
	public int operations(int num1,int num2)
	
	{
		return inf.operation(num1, num2);
	}
}
