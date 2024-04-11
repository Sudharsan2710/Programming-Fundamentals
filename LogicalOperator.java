package com.chainsys.jfs3;

public class LogicalOperator {

	public static void main(String[] args) {
	
		int a = 5;
		int b = 10;
		 {
		
		boolean lessThan = a<b;
		boolean lessThanOrEqual=a<=b;
		boolean greaterThan = a>b;
		boolean greaterThanOrEqual=a>=b;
		
		
		
		System.out.println("a <  b: " + lessThan);
		System.out.println("a <= b: " + lessThanOrEqual);
		System.out.println("a >  b: " + greaterThan);
		System.out.println("a >=  b: " + greaterThanOrEqual);
		
	}
		System.out.println("Invalid input");
}
}
