package com.chainsysjfs3;
import java.util.Scanner;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CabFare {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
    	
    	System.out.println("--------------------------------------------");
        System.out.println("Enter your name");
        String userName = sc.next();
        
        System.out.println("--------------------------------------------");
        System.out.println("enter your distance in kilometer");
        double kiloMeter =sc.nextDouble();
        
        
       
        if(kiloMeter<0) {
        	System.out.println("Enter the correct kilometer ");
        	kiloMeter =sc.nextDouble();
        }
        
        System.out.println("--------------------------------------------");
        
        System.out.println("choose your cab type micro, mini, prime ");
        String cabType = sc.next();
       
        if (cabType.equalsIgnoreCase("Micro")) {
            System.out.println("Calculated hire price for "+userName+": "+Fare.micro(kiloMeter));
        }
        else if(cabType.equalsIgnoreCase("mini")) {
            System.out.println("Calculated hire price for "+userName +": "+Fare.mini(kiloMeter));
        }
        else if(cabType.equalsIgnoreCase("prime")) {
            System.out.println("Calculated hire price for "+userName+": "+Fare.prime(kiloMeter));
        }
        else {
            System.out.println("Please enter the cab type");
        }
        
        System.out.println("--------------------THANK YOU------------------------");
        
        
    }

}