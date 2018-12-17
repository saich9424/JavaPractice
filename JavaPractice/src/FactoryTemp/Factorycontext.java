package FactoryTemp;

public class Factorycontext {
	
	public static SampleInterface checktype(String type)
	{
		
		if(type.equalsIgnoreCase("add"))
		{
			return new Add();
		}
		
		if(type.equals("sub"))
		{
			return new Sub();
			
		}
		
		return null;
	}

}
