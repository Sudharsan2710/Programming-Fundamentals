package com.chainsys.jfs3;

public class Expression {

	public static void main(String[] args) {
				
		int x =2;
		int y = 5;
		int z = 0;
		boolean Equal= (x==2);
		boolean Notequal =(x!=5);
		boolean And =(x!=5)&& (y>=5);
		boolean Or = (z != 0) || (x == 2);
		boolean Not = !(y < 10);

		System.out.println("equal is "+ Equal);
		System.out.println("Notequal is "+ Notequal);
		System.out.println("And is "+  And);
		System.out.println("Or is "+ Or);
		System.out.println("Not is "+ Not );
	}

}
