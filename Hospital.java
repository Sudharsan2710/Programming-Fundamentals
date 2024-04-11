package com.chainsys.jfs2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String HospitalName;
		System.out.println("Enter the Hospital Name :");
		HospitalName=sc.next();
		System.out.println("The HospitalName is: " + HospitalName);
		
		int NumOfIcu;
	    System.out.println("Enter the Number of ICU UNITS:");
	    NumOfIcu=sc.nextInt();
	    System.out.println("Number of ICU units is : " + NumOfIcu);
	    
	    int year;
	    System.out.println("Enter the Year of the opening:");
	    year=sc.nextInt();
	    System.out.println("opened at the year" + year);
	    
	    
	    int TotalNumOfEmployees;
	    System.out.println("Enter the total Num of employees: ");
	    TotalNumOfEmployees=sc.nextInt();
	    System.out.println("Number of employees working : " + TotalNumOfEmployees );
	    
	    
	    boolean hasEmergengyExit;
	    System.out.println("Is Hospital has Emergency exit , true or false: ");
	    hasEmergengyExit = sc.nextBoolean();
	    System.out.println(hasEmergengyExit);
	    
	   
	    
	    

	}

	}


