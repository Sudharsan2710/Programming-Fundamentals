package com.chainsys.jfs3;
import java.util.Scanner;
public class StudentAttendanceChecker {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        int classesHeld;
		        do {
		        System.out.print("Enter the number of classes held: ");
		         classesHeld = sc.nextInt();
		        	if(classesHeld < 0) {
		        		System.out.print("Enter the valid number of classes held: ");	
		        		classesHeld = sc.nextInt();
		        	}
		        }while(classesHeld<0);
		        
		        
		        int classesAttended;
		        do {
		        	System.out.print("Enter the number of classes Attended: ");
		        	classesAttended = sc.nextInt();
		        	if(classesAttended < 0) {
		        		System.out.print("Enter the valid number of classes Attended: ");	
		        		classesAttended = sc.nextInt();
		        	}
		        	}while(classesAttended<0);
		        
		        
		        
		        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;
		        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
		        
		        
		        if (attendancePercentage >= 75) {
		            System.out.println("You are allowed to sit in the exam.");
		        } 
		         
		        else {
		        System.out.println("Enter you have any Medical Clause(Y/N):");
		        	char	medicalCause=sc.next().charAt(0);
		        if(medicalCause=='y'||medicalCause=='Y') {
		        	System.out.println("You are allowed enter the Exam");
		        }
		        
		        	else if(medicalCause=='n'|| medicalCause=='N') {
		        		System.out.println("You are not allowed enter the Exam");
		        	}
		        	else {
		        		System.out.println("Enter the correct input(Y/N): ");
		        		medicalCause=sc.next().charAt(0);
		        		 if(medicalCause=='y'||medicalCause=='Y') {
		        			 System.out.println("You are allowed enter the Exam");
		        		 }
		        		 else if 
		        			 (medicalCause=='n'|| medicalCause=='N') {
		 		        		System.out.println("You are not allowed enter the Exam");
		        		 }
		       
		        	
		        }
		       
		
		        }
	}
}

		    
		


