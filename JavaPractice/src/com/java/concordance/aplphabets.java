/**
 * 
 */
package com.java.concordance;

import java.io.IOException;

/**
 * @author saich
 *
 */
public class aplphabets {
	
	
	public static void main( String [ ] args ) throws IOException
	{

	
		 String alphabet = "abcdefghijklmnopqrstuvwxyz";
		    
            StringBuilder sb = new StringBuilder();		    
		    int remainder= 55/26;  
		    int quotient= 55%26;  
            for(int i=0; i<remainder;i++)
            {
            	sb.append(alphabet.charAt(quotient-1));
            }
            
            sb.append(alphabet.charAt(quotient-1));
		    System.out.println(sb);
    

	}
}
