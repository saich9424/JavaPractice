package com.java.generics;


class Multitest<T,U>
{
	
	
	T obj;
	U object;


	Multitest(T obj,U object){

		this.obj=obj;
		this.object=object;

	}
	
	T intm()
	{
		return this.obj;
	}
	

	U strm()
	{
		return this.object;
	}

}
public class GenericsMultipleType {

	public static void main (String args[])
	{
	
	Multitest<Integer,String> mt = new Multitest<Integer,String>(4,"test");
	System.out.println(mt.strm());
	System.out.println(mt.intm());

	
	}
}
