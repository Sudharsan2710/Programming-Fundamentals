package com.chainsys.jfs3;
import java.util.*;
public class PatternA {
Scanner sc = new Scanner(System.in ); 
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        int n;
	        
	        do {
	            System.out.print("Enter a positive number: ");
	            n = sc.nextInt();
	            if (n < 0) {
	                System.out.println("Please enter a positive number.");
	            }
	        } while (n < 0);
		
		int i , j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
		}
			System.out.println(" ");
		}
		
	}

}
