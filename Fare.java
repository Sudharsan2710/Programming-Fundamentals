package com.chainsysjfs3;

public class Fare {
	
	    public static double micro(double kiloMeter) {
	        double price = kiloMeter*10;
	        double amountReceived =Discount.discountCalculation(price);
	        return amountReceived;
	        
	    }
	    public static double mini(double kiloMeter) {
	        double price = kiloMeter*15;
	        double amountReceived =Discount.discountCalculation(price);
	        return amountReceived;
	        
	    }
	    public static double prime(double kiloMeter) {
	        double price = kiloMeter*20;
	        double amountReceived =Discount.discountCalculation(price);
	        return amountReceived;
	        
	    }


	}


