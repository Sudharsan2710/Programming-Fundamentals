package com.chainsys.jfs3;
import java.util.*;

public class EvenDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Enter a positive number: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (n < 0);
        int sum = 0, rem, temp = 0;

        while (n != 0) {
            rem = n % 10;
            temp = temp + rem;
            if (temp % 2 == 0)
                System.out.println("Even numbers present in the digit: " + temp);
            n = n / 10;
            temp = 0;
        }
    }
}
