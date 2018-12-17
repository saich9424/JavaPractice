package Starategy;

public class StarategyContext {
	
	private SampleInterface si;
	
	public void setstarategy(SampleInterface si)
	{
		this.si=si;
	}
	
	public int operation(int a, int b) 
	{
		return si.operation(a, b);
		
	}
	

}
