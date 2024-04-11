package com.chainsys.jfs3;
import java.util.*;
public class NetBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int YearOfService;
		double salary , netbonus;
		do {
            System.out.print("Enter a positive Year: ");
            YearOfService = sc.nextInt();
            if (YearOfService < 0) {
                System.out.println("Please enter the positive year.");
            }
        } while ( YearOfService < 0);
		do {
            System.out.print("Enter a positive salary: ");
            salary = sc.nextDouble();
            if (salary < 0) {
                System.out.println("Please enter the salary.");
            }
        } while ( salary < 0);
		if(YearOfService>5) {
			netbonus=salary+ (salary * 0.05);
			System.out.println("the total salary: " + netbonus);
		}
		else {
			System.out.println("the year of service is low");
		}
	}

}
