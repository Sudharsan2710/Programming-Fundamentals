package com.chainsys.jfs2;
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the first number:" );
		System.out.println (num1=sc.nextInt());
		System.out.println("Enter the Second number:" );
		System.out.println (num2=sc.nextInt());
		
		//Arithmetic operator
		
		//add
		int add =num1 + num2  ;
		System.out.println("Addition of Numbers " + add);
		
		//sub
		int sub= num1 - num2;
		System.out.println("Subtraction of Numbers " + sub);
		
		//Multiplication
		int mult = num1 * num2;
		System.out.println("multiplication of Numbers " + mult);
		
		//division
		double div = num1 / num2 ;
		System.out.println("Division of Numbers " + div);
		
		//modulus 
		double mod = num1 % num2;
		System.out.println("Modulus of Numbers " + mod);
		
		//unary operator
		//unary minus
		num1 = -num1;
		System.out.println("unary minus: " + num1 );
		
		//unary++
		 num1++;
	}

}
