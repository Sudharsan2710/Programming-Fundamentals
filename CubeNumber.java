package com.chainsys.jfs3;

import java.util.*;

public class CubeNumber {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number n: ");
		        int n = scanner.nextInt();

		        // Print odd and even numbers up to n
		        System.out.println("Odd numbers up to " + n + ":");
		        for (int i = 1; i <= n; i++) {
		            if (i % 2 != 0) {
		                System.out.println(i);
		            }
		        }

		        System.out.println("Even numbers up to " + n + ":");
		        for (int i = 1; i <= n; i++) {
		            if (i % 2 == 0) {
		                System.out.println(i);
		            }
		        }

		        // Calculate and print the cube of n
		        int cube = n * n * n;
		        System.out.println("The cube of " + n + " is: " + cube);
		    }
		}
	

