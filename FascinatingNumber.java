package com.chainsys.jfs3;
import java.util.Scanner;
public class FascinatingNumber {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        do {
	            System.out.print("Enter a positive integer greater than 0: ");
	            while (!sc.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a valid positive integer.");
	                sc.next();
	            }
	            n = sc.nextInt();
	        } while (n <= 0);

	        
	        String concatenated = Integer.toString(n) + Integer.toString(n * 2) + Integer.toString(n * 3);

	       
	        boolean isFascinating = checkFascinating(concatenated);

	        if (isFascinating) {
	            System.out.println(n + " is a fascinating number.");
	        } else {
	            System.out.println(n + " is not a fascinating number.");
	        }
	    }

	    
	    public static boolean checkFascinating(String str) {
	        
	        if (str.length() != 9) {
	            return false;
	        }

	        
	        for (int i = 1; i <= 9; i++) {
	            if (str.indexOf(Integer.toString(i)) == -1) {
	                return false;
	            }
	        }

	        return true;
	    }
	}

