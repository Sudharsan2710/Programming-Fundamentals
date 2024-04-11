package com.chainsys.jfs3;

public class Pattern2 {

	public static void main(String[] args) {
				
				 int n = 6;
			        
			        // Upper half
			        for (int i = 0; i < n; i++) {
			            // Print spaces before the stars
			            for (int j = i; j < n - 1; j++) {
			                System.out.print(" ");
			            }
			            // Print stars
			            for (int j = 0; j < 2 * i + 1; j++) {
			                System.out.print("*");
			            }
			            // Move to the next line
			            System.out.println();
			        }
			        
			        // Lower half
			        for (int i = n - 2; i >= 0; i--) {
			            // Print spaces before the stars
			            for (int j = i; j < n - 1; j++) {
			                System.out.print(" ");
			            }
			            // Print stars
			            for (int j = 0; j < 2 * i + 1; j++) {
			                System.out.print("*");
			            }
			            // Move to the next line
			            System.out.println();
		        }
		    }
		

	}


