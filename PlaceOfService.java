package com.chainsys.jfs3;
import java.util.*;
public class PlaceOfService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age:");
		int age = sc.nextInt()  ;
		if(age>0) {
		System.out.println("The age of the person is:"+age);
		
		}
		else {
			System.out.println("Enter the correct age:");
			age = sc.nextInt();
		}
		
		
		
		System.out.println("Enter the Martial status (Y/N):" );
		char martialStatus = sc.next().charAt(0);
		
		
		
		if (martialStatus == 'Y') {
			System.out.println("Married");
		} else if ((martialStatus == 'N')) {
			if (martialStatus == 'N')
				System.out.println("Not Married");
		}

		
		else if (martialStatus != 'Y' || martialStatus != 'N') {
			if (martialStatus != 'Y' || martialStatus != 'N') {
				System.out.println("Enter the correct Input");
				martialStatus = sc.next().charAt(0);
			} 
		
		}
	
		System.out.println("Enter the sex(M/F): ");
		String placeOfservice;
		char sex=sc.next().charAt(0);
		
		
		
		if(sex!='F'&& sex!='M') {
			System.out.println("Enetr the correct Input:");
			sex=sc.next().charAt(0);
		}
	
		if(sex=='F') {
			 placeOfservice="work in urban areas";
			 System.out.println(placeOfservice);
		}
			 else if((sex=='M')||(age>=20 && age<=40)) {
			placeOfservice="he may work in any where ";
			System.out.println(placeOfservice);
			 }
			 else if((sex=='M')||(age>=40 && age<=60)) {
					placeOfservice="he may work in urban area ";
					System.out.println(placeOfservice);
			 }
			 else {
				 System.out.println("Error");
		}
			
		
				}
			
		}



