package com.java.generics;

import java.util.ArrayList;

class test <T>
{
	T obj;
	test (T obj)
	{
		this.obj=obj;
	}
	
	public T getobj()
	{
		return this.obj;
	}
}
public class GenericsTest {
	
	public static void main(String args[])
	{
		test<Integer> testInt= new test<Integer>(15);
		
		System.out.println(testInt.getobj());
		
		test<String> testString= new test<String>("Hi");
		
		System.out.println(testString.getobj());

		

	}

}
