/**
 * 
 */
package com.java.concordance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author saich
 *
 */
public class Text {


	public static void main( String [ ] args ) throws IOException
	{

		String fileName = "C:\\Users\\saich\\eclipse-workspace\\JavaPractice\\heroqst1.txt";



		//Read file
		String text = new String(Files.readAllBytes(Paths.get(fileName)) );

		//Initializing the sentence Iterator
		BreakIterator sentenceIterator = BreakIterator.getSentenceInstance();

		//Setting the file input to sentenceIterator
		sentenceIterator.setText(text);

		//Setting sentenceNumber for sentence end
		int startIndex =0;

		// We are using tree map because it sorts the strings in order 
		TreeMap <String, LinkedList<Integer>> wordOccurence = new TreeMap();

		//Incrementing sentenceNumber
		int sentenceNumber=1;

		while(BreakIterator.DONE !=sentenceIterator.next())
		{
			//Storing each sentence to a string
			String sentence = text.substring(startIndex, sentenceIterator.current());

			//Updating start Index
			startIndex=sentenceIterator.current();

			//Splitting sentence into tokens
			StringTokenizer st = new StringTokenizer( sentence );
			while( st.hasMoreTokens( ) )
			{
				String word = st.nextToken( );
				
				//Storing token occurence in linked list
				LinkedList<Integer>  lines = (LinkedList) wordOccurence.get(word);
				
				//Checking if token occurred first time
				if(lines !=null)
				{
					lines.addLast(sentenceNumber);
					wordOccurence.put(word, lines);

				}
				else {
					lines = new LinkedList();
					lines.add(sentenceNumber);
					wordOccurence.put(word, lines);
				}


			}

			sentenceNumber++;


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


