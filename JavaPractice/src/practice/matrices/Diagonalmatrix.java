package practice.matrices;

import java.util.Scanner;

public class Diagonalmatrix {
	
	public static void main(String args[]) 
	{
		
		Scanner in = new Scanner(System.in);
		
		int mtsize= in.nextInt();
		
		int diagonalelements= in.nextInt();
		
		int mat[][] = new int[mtsize][mtsize];
		
		
		for(int i=0; i<mtsize; i++)
		{
			for(int j=0; j<mtsize; j++)
			{
				
				 mat[i][j]= in.nextInt();
			}
			
		}
		
		for(int k=0;k<diagonalelements;k++)
		{
			
			
			
				
				if(k==0)
				{
					
					for(int i=0;i<mtsize;i++)
					{
						
						
						
						if(i!=mtsize-1)
						{
							System.out.print(mat[i+k][i+k]+" ");

						}
						else
						{
							System.out.print(mat[i+k][i+k]);

						}
					}
				}
				
				
				if(k>0)
				{
					
					
					for(int i=0;i<mtsize-k;i++)
					{
						
						
						if(i!=mtsize-1)
						{
							System.out.print(mat[i+k][i]+" ");

						}
						
						else
						{
							System.out.print(mat[i+k][i]);

						}
					}
					
					System.out.println();

					for(int i=0;i<mtsize-k;i++)
					{
						
						if(i!=mtsize-1)
						{
							System.out.print(mat[i][i+k]+" ");

						}
						else
						{
							System.out.print(mat[i][i+k]);

						}
					}
					
					System.out.println();

					
				}
				
				if(k!=diagonalelements-1)
				{
					System.out.println();

				}
		}

		
	}
	

}
