package com.chainsys.jfs2;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String BookName;
		System.out.println("Enter the Book name :");
		BookName=sc.next();
		System.out.println("The Book name: " + BookName);
		
		int NumOfPages;
	    System.out.println("Enter the Number of the Pages:");
	    NumOfPages=sc.nextInt();
	    System.out.println("Number of the pages there : " + NumOfPages);
	    
	    int year;
	    System.out.println("Enter the Published Year of the Book:");
	    year=sc.nextInt();
	    System.out.println("Published year of the Book Is : " + year);
	    
	    
	    String Author;
	    System.out.println("Enter the Author Name : ");
	    Author=sc.next();
	    System.out.println("Author Name is : " + Author);
	    
	    
	    boolean hasFantasy;
	    System.out.println("Is Book has Fantasy true or false: ");
	    hasFantasy=sc.nextBoolean();
	    System.out.println(hasFantasy);
	    
	    String genre;
	    System.out.println("What genre belongs to  : ");
	    genre=sc.next();
	    System.out.println("Genre : " + genre);
	    
	    

	}

}
