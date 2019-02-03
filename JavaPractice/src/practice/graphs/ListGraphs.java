package practice.graphs;

import java.util.LinkedList;
import java.util.List;

public class ListGraphs {

	List<Integer> a[];  
	ListGraphs(int v)
	{
		a=new LinkedList[v];

		for(int i=0; i<v; i++)
		{
			a[i] = new LinkedList<>();
		}


	}

	void addVertex(int src, int dest)
	{

		a[src].add(dest);
		a[dest].add(src);

	}

	void print()
	{
		for(int i=0;i<a.length;i++)
		{

			System.out.print(i);
			for(int g :a[i])
			{

				System.out.print(" ===> "+g);
			}

			System.out.println();

			
		}

	}

	public static void main(String args[])
	{


		ListGraphs lg = new ListGraphs(5);
		lg.addVertex(0,1);
		lg.addVertex(0,4);
		lg.addVertex(1,2);
		lg.addVertex(1,3);
		lg.addVertex(1,4);
		lg.addVertex(2,3);
		lg.addVertex(3,4);

		lg.print();


	}

}
