package pratice.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stringsearch {
	
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		String orginal= in.nextLine();
		
		String substring= in.nextLine();
		
		
		boolean flag=true;
		
		int size= orginal.length();
		
		String correctstring = null;
		
	    List <Character> char2= new ArrayList<>();
	    for(int k=0; k<substring.length();k++)
		{
			
				
	    	char2.add(substring.charAt(k));
		}


		for(int i=0;i<orginal.length();i++)
		{
			
			for(int j=i; j<orginal.length()+1;j++)
			{
				
				String substring2 = orginal.substring(i, j);
				
			    char a[]=substring.toCharArray();
			    
				flag = true;
				for(int k=0; k<substring2.length();k++)
				{
					
						
					if(char2.contains(substring2.charAt(k)) & flag)
					{
						
						flag=true;
					}
					
					else
					{
						flag=false;

					}
				}
				
				if(flag && substring2.length()<size)
				{
					
					correctstring=substring2;
					
				}
				
			}
			
		}
		
		System.out.println(correctstring);
		
	}

}
