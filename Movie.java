package com.chainsys.jfs2;
import java.util.Scanner;
public class Movie {
//data members
	//MovieName
	//year
	//duration
	//isComedy
	//no of Songs
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String MovieName;
		System.out.println("Enter the movie name :");
		MovieName=sc.next();
		System.out.println("The movie name: " + MovieName);
		
		int duration;
	    System.out.println("Enter the Duration of the Movie:");
	    duration=sc.nextInt();
	    System.out.println("Duration of the Movie Is : " + duration);
	    
	    int year;
	    System.out.println("Enter the released Year of the Movie:");
	    year=sc.nextInt();
	    System.out.println("Released year of the Movie Is :" + year);
	    
	    
	    int songs;
	    System.out.println("Enter the number of songs :");
	    songs=sc.nextInt();
	    System.out.println(" Total songs are :" + songs);
	    
	    
	    boolean hasComedy;
	    System.out.println("Is Movie has Comedy true or false:");
	    hasComedy=sc.nextBoolean();
	    System.out.println(hasComedy);
	    

	}

}
