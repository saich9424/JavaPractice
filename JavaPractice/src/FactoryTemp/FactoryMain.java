package FactoryTemp;

public class FactoryMain {
	
	
	public static void main(String args[])
	{
		
		SampleInterface se= Factorycontext.checktype("Add");
		System.out.println(se.operation(4,5));
	}

}
