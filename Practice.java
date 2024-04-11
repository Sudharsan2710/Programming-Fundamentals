package com.chainsys.jfs3;
import java.lang.*;
public class Practice {
    public static void main(String[] args) {
        
		String sampleString = "Hello, World!";
        
     
        int length = sampleString.length();
        System.out.println("Length of the string: " + length);
        
        char indexPosition =sampleString.charAt(4);
        System.out.println("Index position of the character: " + indexPosition);
       
        String lowerCaseString = sampleString.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString);
        
       
        String upperCaseString = sampleString.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);
        
        
        String prefix = "Hello";
        boolean startsWithHello = sampleString.startsWith(prefix);
        System.out.println("Does the string start with '" + prefix + "'? " + startsWithHello);
        
        
        String suffix = "!";
        boolean endsWithExclamation = sampleString.endsWith(suffix);
        System.out.println("Does the string end with '" + suffix + "'? " + endsWithExclamation);
        
       
        int startIndex = 7;
        String substring = sampleString.substring(startIndex);
        System.out.println("Substring starting from index " + startIndex + ": " + substring);
        
        
        String s2="Hi All";
        String s3= sampleString.concat(s2);
        System.out.println("The concatenated String: "+ s3 );
        
        
        String subs1 = sampleString.substring(3);
        System.out.println("The Substring Method1:"+subs1);
        
        
        String subs2 = sampleString.substring(3,10);
        System.out.println("The Substring Method2:"+subs2);
        
        
        int indexPos1=sampleString.indexOf("World!");
        System.out.println("the index pos starting from w is "+indexPos1);
        
        
         sampleString = "Hello, World!";
        int output = sampleString.indexOf("or",9);
        System.out.println("Indexof is shown in: "+output);
        
        int LastIndexof=sampleString.lastIndexOf("ld");
        System.out.println("lastindexof is shown in "+LastIndexof);
        
        boolean equalsIgnoreCase="Hello".equalsIgnoreCase("hello");
        System.out.println(equalsIgnoreCase);
        
        boolean equals=sampleString.equals("Hello,World!");
        System.out.println(equals);
        
        s2="Hi All";
        int compareTo=sampleString.compareTo(s2);
        System.out.println(compareTo);
        
        int compareTo1=sampleString.compareTo(sampleString);
        System.out.println(compareTo1);
        
        String s4="helloworld";
        int compareTo3=s4.compareToIgnoreCase(sampleString);
        System.out.println(compareTo3);
        
        String s5=" hey hi all ";
        String s6=s5.trim();
        System.out.println(s6);//by removing whitespaces at both ends.
        
        String replace=s5.replace("ey","ss");
        System.out.println(replace);
        
        char[] ch=sampleString.toCharArray();
        for (char c : ch) {
            System.out.print(c + " ");
        }
        
       
    }
}





