package practice.matrices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Box
{
	char row,col;

	public  Box(char row, char col) {
		this.row=row;
		this.col=col;
	}
}
public class BasicGold {
	static Box mat[][] ;
	static int row,col;

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);


		row= in.nextInt();
		col=in.nextInt();

		mat=new Box[row][col];



		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				char letter= in.next().charAt(0);
				if(letter =='D')
				{
					char row1 =in.next().charAt(0);
					char col1= in.next().charAt(0);
					mat[i][j]= new Box(row1,col1);
				}

				if(letter =='G')
				{
					
					mat[i][j]= new Box('G','G');
				}

				if(letter =='T')
				{
					
					mat[i][j]= new Box('T','T');
				}
			}

		}

		
		int gamerow= in.nextInt();
		
		
		int matvertices[][] = new 
				 int[gamerow][3];

		for(int k=0; k<gamerow; k++)
		{
			for(int l=0; l<3; l++)
			{
		
				matvertices[k][l]= in.nextInt();

				
			}
			
		}
		
		System.out.println();
		
		int winner = 0;
		for(int m=0; m<gamerow; m++)
		{
			boolean b=check( matvertices[m][1],matvertices[m][2]);
			
			if(b)
			{
				winner=m+1;
			}
			
		}
		
		System.out.println(winner);
	}
	
	public static boolean check(int thisrow, int thiscol)
	{
		int row1 = 0,col1 = 0;
		Box b=  mat[thisrow][thiscol];
		
		if (b.col=='T')
			return false;
		if(b.row=='G')
			return true;
		else
		{
			if((Character.getNumericValue(b.col)+thiscol)>col || (Character.getNumericValue(b.col)+thiscol)<0)
			{
				col1=(b.col+thiscol+col)%col;
				
			}
			
			else
			{
				
				col1=Character.getNumericValue(b.col)+thiscol;
			}
			
			if((Character.getNumericValue(b.row)+thisrow)>row)
			{
					row1=(b.row+thisrow+row)%row;
				
				
			}
			
			else
			{
				
				row1=Character.getNumericValue(b.row)+thisrow;
			}
			
			check(row1, col1);
		}
		return true;
		
		
		
		
	}
}
