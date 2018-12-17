/**
 * 
 */
package com.patterns.factory;

/**
 * @author saich
 *
 */
public class FactoryDemo {
	public static void main (String args[])
	{
		
		FactoryImpl  fimpl = new FactoryImpl();
		Interface i=fimpl.factorySelect("add");
		System.out.println(i.operation(5, 6));
	}

}
