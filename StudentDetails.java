package com.chainsys.jfs2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String studentName;
		System.out.println("Enter the Student Name :");
		studentName=sc.next();
		System.out.println("The name is: " + studentName);
		
		
		String qualification;
		System.out.println("Enter the qualification :");
		qualification=sc.next();
		System.out.println("He is Qualified as: " + qualification);
		
		String pan;
	    System.out.println("Enter the Permanent Account Number:");
	    pan=sc.next();
	    System.out.println("PAN number Is : " + pan);
	    
	    int Birthyear;
	    System.out.println("Enter the Year of the Birth:");
	    Birthyear=sc.nextInt();
	    System.out.println("Born at the year of: " + Birthyear);
	    
	    
	    String address;
	    System.out.println("Enter the student address : ");
	    address=sc.next();
	    System.out.println("he is located at : " + address);
	    
	    
	    boolean hasEmployeed;
	    System.out.println("Is he working ,  true or false: ");
	    hasEmployeed=sc.nextBoolean();
	    System.out.println(hasEmployeed);
	    

	}

}
