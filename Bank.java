package com.chainsys.jfs2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String BankName;
		System.out.println("Enter the Bank Name :");
		BankName=sc.next();
		System.out.println("Bank name is : " + BankName);
		
		
		String AcountHolder;
		System.out.println("Enter the Account holder Name :");
		AcountHolder=sc.next();
		System.out.println("The Account holder name is: " + AcountHolder);
		
		long AccNum;
	    System.out.println("Enter the Account Number:");
	    AccNum=sc.nextLong();
	    System.out.println("Account Number Is : " + AccNum);
	    
	    int year;
	    System.out.println("Enter the Year of the Account opening:");
	    year=sc.nextInt();
	    System.out.println("Account opened in: " + year);
	    
	    
	    String Branch;
	    System.out.println("Enter the Branch Name : ");
	    Branch=sc.next();
	    System.out.println("Branch Name is : " + Branch);
	    
	    
	    boolean hasAlreadyAccount;
	    System.out.println("Is Already account open,  true or false: ");
	    hasAlreadyAccount=sc.nextBoolean();
	    System.out.println(hasAlreadyAccount);
	    
	    
	    
	}

}
