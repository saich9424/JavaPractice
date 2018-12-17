package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	
	public static void main(String args[])
	{
	
		samplewildcard sw = new  samplewildcard();
	List<Integer> intlist = new ArrayList<>();
	intlist.add(5);
	intlist.add(6);
	
	
	List<Double> dlist =new ArrayList<>();
	
	dlist.add(5.0);
	dlist.add(6.0);
	
	
	sw.lowerbound(intlist);
	sw.upperbound(dlist);
	sw.nobound(dlist);
	
	}
}


class samplewildcard
{

	public void upperbound(List< ? extends Number> list)
	{
		System.out.println(list);	
		
	}
	
	public void lowerbound(List< ? super Integer> list)
	{
		System.out.println(list);	
		
	}
	
	public void nobound(List< ?> list)
	{
		System.out.println(list);	
		
	}
}