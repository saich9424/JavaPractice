package TempAdapter;

public class AdapterMain {

	public static void main(String args[])
	
	{
		Add ab= new Add();
		Sub sb= new Sub();
		ab.add(5, 4);
		sb.sub(5, 9);
		Add a = new onewayadapter(sb);
		a.add(5,7);
	}
}
