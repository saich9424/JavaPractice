package com.java.generics;


 class SampleTest<T>
{
	 T obj;
	 
	  T sample(T a)
	 {
		 return a;
	 }
	
}
public class GenericsSample {
	
	public static void main(String args[])
	{
	SampleTest<Integer> ab = new SampleTest<Integer>();
	
	ab.sample(4);
	}

}
