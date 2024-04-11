package com.chainsys.jfs3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RexSample {

	public static void main(String[] args) {
		
	//	String sentence = "picky people pick peter pan peanut-butter, 'tis the peanut-butter picky people pick.";
	//	Pattern p = Pattern.compile("pea");
	//	Matcher m = p.matcher(sentence);
	//	while (m.find()) {
	//		System.out.println(m.group() + " starts: " + m.start() + " Ends at: " + m.end());
		
	String sen="Tamil is the oldest language";
	Pattern p = Pattern.compile("^T|l|a");
	Matcher m = p.matcher(sen);
	while(m.find()) {
		System.out.println(m.group()+" starts with: "+ m.start());
		System.out.println(m.group()+" Ends with: "+ m.end());
	
	
	}
		
	}
}


