package com.chainsys.jfs3;
import java.util.*;
public class PatternC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		
		  do {
	            if (n < 0) {
	                System.out.println("Please enter a positive number.");
	                n = sc.nextInt();
	            }
	        } while (n < 0);
		
		for(int i=n;i>=1;i--) {
            for(int s=i;s<n;s++) {
                System.out.printf(" ");
            }
            for(int j=1;j<=i*2-1;j++) {
                if(j%2==0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

	}

}
