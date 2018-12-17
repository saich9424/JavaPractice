package Starategy;

public class starategyImplementation {
	
	public static void main (String args[])
	
	{
		
		StarategyContext sc = new StarategyContext();
		sc.setstarategy(new Add());
		System.out.println(sc.operation(5, 6));
	}

}
