package com.chainsysjfs3;

public class Discount {
public static double discountCalculation(double price) {
        
        if(price>=2000 && price<5000) {
            System.out.println("eligible for 2% discount");
            double discountPrice = price*0.05;
            double Topay = price - discountPrice;
            System.out.println("the discounted Price "+ discountPrice);
            return Topay;
        }
        else if(price>=5000) {
            System.out.println("eligible for 5% discount");
            double discountPrice = price*0.05;
            double Topay = price - discountPrice;
            System.out.println("the discounted Price "+ discountPrice);
            return Topay;
        }
        else {
            System.out.println("not eligible for discount");
            return price;
        }
    }

}


