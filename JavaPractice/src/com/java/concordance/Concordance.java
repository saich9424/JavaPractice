/**
 * 
 */
package com.java.concordance;

/**
 * @author saich
 *
 */
import java.io.*;
import java.util.*;

public class Concordance {
  private Map<String,String> map = new TreeMap<String,String>();
  private Set<String> words = new TreeSet<String>();
  
  public Concordance(String source, String filter) {
    int lineNumber = 0;
    try {
      Scanner input = new Scanner(new File(filter));
      while (input.hasNextLine()) {
        String line = input.nextLine();
        StringTokenizer parser = new StringTokenizer(line);
        words.add(parser.nextToken().toUpperCase());
      }
      input = new Scanner(new File(source));
      while (input.hasNextLine()) {
        String line = input.nextLine();
        ++lineNumber;
        StringTokenizer parser = new StringTokenizer(line,",.;:()-!?' ");
        while (parser.hasMoreTokens()) {
          String word = parser.nextToken().toUpperCase();
          if (words.contains(word)) {
            continue;
          }
          String listing = map.get(word);
          if (listing == null) {
            listing = "" + lineNumber;
          } else {
            listing += ", " + lineNumber;
          }
          map.put(word,listing);
        }
      }
      input.close();
    } catch(IOException e) {
      System.out.println(e);
    }
  }
  
  public void write(String file) {
    try {
      PrintWriter output = new PrintWriter(file);
      for (Map.Entry<String,String> entry : map.entrySet()) {
        output.println(entry);
      }
      output.close();
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}