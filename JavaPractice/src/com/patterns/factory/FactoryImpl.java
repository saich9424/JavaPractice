/**
 * 
 */
package com.patterns.factory;

/**
 * @author saich
 *
 */
public class FactoryImpl {

	 public static Interface factorySelect(String type)
	{
		if(type == null)
		{
			return null;
		}
		if(type.equalsIgnoreCase("add"))
		{
			return new AddPattern();
		}
		
		if(type.equalsIgnoreCase("subract"))
		{
			return new SubtractPattern();
		}
		return null;
	}
}
