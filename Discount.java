package com.chainsys.jfs3;

import java.util.*;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity;
		double cost = 0.0;
	    do {
            System.out.print("Enter a correct quantity: ");
            quantity = sc.nextInt();
            if (quantity < 0) {
                System.out.println("Please enter the correct quantity.");
            }
        } while ( quantity< 0);
		
		if (quantity >= 1000) {
			cost = quantity * 100 * (0.10);
			System.out.println("The total cost including discount:" + cost);
		}
		 else {
			cost = quantity * 100;
		System.out.println("The total cost without discount:" + cost);
		 }
	}

}
