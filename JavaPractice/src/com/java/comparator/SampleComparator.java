package com.java.comparator;

import java.io.*; 
import java.util.*; 
  
// A class 'Movie' that implements Comparable 
class Movie implements Comparable<Movie> 
{ 
    private double rating; 
    private String name; 
    private int year; 
  
    // Used to sort movies by year 
    public int compareTo(Movie m) 
    { 
    	System.out.println("This year is"+this.year);
    	System.out.println("Movie year is"+m.year);
    	System.out.println((this.year - m.year));

        return this.year - m.year; 
    } 
  
    // Constructor 
    public Movie(String nm, double rt, int yr) 
    { 
        this.name = nm; 
        this.rating = rt; 
        this.year = yr; 
    } 
  
    // Getter methods for accessing private data 
    public double getRating() { return rating; } 
    public String getName()   {  return name; } 
    public int getYear()      {  return year;  } 
} 
  
// Driver class 
class SampleComparator 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<Movie> list = new ArrayList<Movie>(); 
        list.add(new Movie("Force Awakens", 8.3, 2015)); 
        list.add(new Movie("Star Wars", 8.7, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
        System.out.println("Before Sorting");
  
        Collections.sort(list); 
  
        System.out.println("Movies after sorting : "); 
        for (Movie movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
        } 
    } 
} 
