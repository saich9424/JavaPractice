package TempAdapter;

public class onewayadapter extends Add {
	
	private Sub sub;
	
	public onewayadapter(Sub sub) {
    this.sub=sub;
	}
	
	
	public int add(int a, int b)
	{
		return sub.sub(a, b);
	}
	

}
