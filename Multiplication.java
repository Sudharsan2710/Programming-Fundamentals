package com.chainsys.jfs3;
import java.util.*;
public class Multiplication {

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
		
		for(int i=0;i <= 10; i++) {
			int m = n * i ;
			System.out.println(n + "*" + i + "=" + m);
		
	}
	}
}
