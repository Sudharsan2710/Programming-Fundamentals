package com.chainsys.jfs3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternMatches {

	public static void main(String[] args) {
		//
		System.out.println(Pattern.matches( 
					"helowrd*", "hello world"));
		
		
		System.out.println(Pattern.matches(
		            "geeksforge*ks", "geeksforgeeks"));
		
		
		
		System.out.println(
	            Pattern.matches("g*geeks*", "geeksfor"));
	}

}
