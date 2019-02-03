package practice.matrices;

import java.util.Scanner;

public class SampleMatrix {
	
	static int[][] a = new int [4][4];
	
	public static void main(String args[])
	{
		
		System.out.println("Enter the matrix elements");
		
		for(int row=0;row<4;row++)
		{
			
			for(int coloumn =0;coloumn<4;coloumn++)
			{
				
				System.out.println("Enter Row "+row+"Coloumn " + coloumn);
				Scanner sc = new Scanner(System.in);
				int in = sc.nextInt();
				
				a[row][coloumn]= in;
			}
		}
			
		for(int row=0;row<4;row++)
		{
			
			for(int coloumn =0;coloumn<4;coloumn++)
			{
			
				
			System.out.println(	a[row][coloumn]);
			}
		}
		
	}

}
