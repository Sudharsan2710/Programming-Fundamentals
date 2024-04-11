package com.chainsys.jfs2;

import java.util.*;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char oper;
		double num1, num2, result;
		System.out.println("Enter the first number:");
		System.out.println(num1 = sc.nextDouble());
		System.out.println("Enter the Second number:");
		System.out.println(num2 = sc.nextDouble());

		System.out.println("Enter the Action to be done");
		oper = sc.next().charAt(0);

		switch (oper) {
		case ('+'):
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case ('-'):
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case ('/'):
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		case ('%'):
			result = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + result);
			break;
		case ('*'):
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;

		default:
			System.out.println("Invalid input");
			break;

		}
		sc.close();

	}

}
