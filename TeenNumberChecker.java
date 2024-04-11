package com.chainsys.jfs3;
import java.util.Scanner;
public class TeenNumberChecker {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter three numbers separated by spaces:");
	        int num1 = getIntFromUser(scanner);
	        int num2 = getIntFromUser(scanner);
	        int num3 = getIntFromUser(scanner);
	        
	        System.out.println("Has teen number: " + hasTeen(num1, num2, num3));

	        System.out.println("Enter a single number:");
	        int singleNum = getIntFromUser(scanner);

	        System.out.println("Is teen number: " + isTeen(singleNum));

	        
	    }

	    public static boolean hasTeen(int num1, int num2, int num3) {
	        return isTeen(num1) || isTeen(num2) || isTeen(num3);
	    }

	    public static boolean isTeen(int num) {
	        return num >= 13 && num <= 19;
	    }

	    public static int getIntFromUser(Scanner scanner) {
	        while (true) {
	            System.out.print("Enter a number: ");
	            if (scanner.hasNextInt()) {
	                int num = scanner.nextInt();
	                if (num >= 0) {
	                    return num;
	                } else {
	                    System.out.println("Invalid input. Please enter a non-negative integer.");
	                }
	            } else {
	                System.out.println("Invalid input. Please enter an integer.");
	                scanner.next(); 
	            }
	        }
	    }
	}



