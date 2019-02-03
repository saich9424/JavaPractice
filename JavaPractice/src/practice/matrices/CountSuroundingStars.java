package practice.matrices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CountSuroundingStars {

	static String[][] a = {{"a","*","b","*"},
			{"*","*","c","*"},
			{"*","e","*","*"},
			{"d","*","*","f"},
	};

	static String[][] b = {{"a","*","b","*"},
			{"*","*","c","*"},
			{"*","e","*","*"},
			{"d","*","*","f"},
			{"d","*","*","f"}
	};



	static int countstars(String a ,String[][] b)
	{
		int count=0;

		for(int row=0; row< b.length; row++)
		{
			for(int coloumn=0; coloumn<b[row].length; coloumn++)
			{

				if(b[row][coloumn].equals(a))
				{

					for(int row1=0; row1< b.length; row1++)
					{
						for(int coloumn1=0; coloumn1<b[row].length; coloumn1++)
						{

							if((row1==row-1&&(coloumn1==coloumn|| coloumn1==coloumn+1||coloumn1==coloumn-1)) ||(row1==row&&coloumn1==coloumn+1)||(row1==row&&coloumn1==coloumn-1)||(row1==row+1&&(coloumn1==coloumn|| coloumn1==coloumn+1||coloumn1==coloumn-1)))
							{

								if(b[row1][coloumn1].equals("*"))
								{
									count++;
								}
							}
						}

					}

				}
			}
		}

		return count;


	}

	public static void main(String args[])
	{
		char alpha='9';
		int starCount=0;

		System.out.println();
		System.out.println(CountSuroundingStars.countstars("c",a));
		String alphabets="abcdefghijklmnopqrstuvwxyz";

		char array[]= alphabets.toCharArray();


		for(int row =0; row<a.length;row ++)
		{
			for(int coloumn=0; coloumn<a[row].length; coloumn++)
			{

				if(!a[row][coloumn].equals("*"))
				{
					if(starCount<CountSuroundingStars.countstars(a[row][coloumn],a))
					{
						starCount=CountSuroundingStars.countstars(a[row][coloumn],a);
						alpha=a[row][coloumn].charAt(0);
					}
				}

				if(starCount==CountSuroundingStars.countstars(a[row][coloumn],a) && alpha!='9')
				{
					if(alphabets.indexOf(a[row][coloumn].charAt(0))<(alphabets.indexOf(alpha)))
					{
						starCount=CountSuroundingStars.countstars(a[row][coloumn],a);
						alpha=a[row][coloumn].charAt(0);
					}
				}



			}
		}


		System.out.println("alphabet is "+ alpha + " No of stars are "+starCount);
	}
}
