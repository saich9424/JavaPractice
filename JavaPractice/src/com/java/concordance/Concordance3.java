/**
 * 
 */
package com.java.concordance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author saich
 *
 */
public class Concordance3 {
	public static void main( String [ ] args ) throws IOException
	{
		// Storing the file input to the buffer
		BufferedReader br = new BufferedReader( new FileReader( "C:\\Users\\saich\\eclipse-workspace\\JavaPractice\\heroqst1.txt") );
		String line;
		
		// We are using tree map because it sorts the strings in order 
		TreeMap <String, LinkedList<Integer>> wordOccurence = new TreeMap( );

		for( int lineNum = 1; ( line = br.readLine( ) ) != null; lineNum++ )

		{
			StringTokenizer st = new StringTokenizer( line );
			while( st.hasMoreTokens( ) )
			{
				String word = st.nextToken( );
				LinkedList<Integer>  lines = (LinkedList) wordOccurence.get(word);
				if(lines !=null)
				{
					lines.addLast(lineNum);
					wordOccurence.put(word, lines);

				}
				else {
					lines = new LinkedList();
					lines.add(lineNum);
					wordOccurence.put(word, lines);
				}
			}

		}

		for(Map.Entry<String, LinkedList<Integer>> entry : wordOccurence.entrySet())
		{
			StringBuilder sb =  new StringBuilder();

			LinkedList  print = entry.getValue();
			for (int i=0; i<print.size(); i++)

			{   
				if(i==0)
				{
					sb.append(String.format("%-30s",entry.getKey())+"{"+print.size()+":"+print.get(i));
				}
				else
				{
					sb.append("," +print.get(i));
				}

			}
			sb.append("}");
			
			System.out.print(sb+"\n");
			

		}

	}

}
