package com.java.generics;

 class gm {
	
	public <S extends Number,T> boolean samplemethod(S k,T  t)
	{
		return t.equals(k) ;
	}

	
}


public class GenericMethod
{
	public static  void main (String args[])
	{
		
		gm g = new gm();
		
		System.out.println(g.<Number,Integer>samplemethod(5,5));
	}
	
}