package com.chainsys.jfs3;
import java.util.Scanner;
import java.math.*;
public class AlgebraEquation {
public static void main(String[] args) {
	int y = 5;
	do {
        
        if (y < 0) {
            System.out.println("Please enter a correct number.");
        }
	}while(y>=10);
	
		for( y = 5 ; y<=10;y++) {
			double result = 2 * Math.pow(y, 2)+y+5;
		
			System.out.println("For Y = "+ y + ",the result is: " + result );
		}
		
	}
	
}


