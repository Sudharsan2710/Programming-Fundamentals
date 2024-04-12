package com.chainsys.jfs3;
import java.util.Scanner;

public class WetherAdvice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Is it raining? (yes/no): ");
        String rainingInput = input.nextLine().trim().toLowerCase();

        
        while (!rainingInput.equals("yes") && !rainingInput.equals("no")) {
            System.out.println("Please enter either 'yes' or 'no'.");
            System.out.print("Is it raining? (yes/no): ");
            rainingInput = input.nextLine().trim().toLowerCase();
        }

        
        System.out.print("What is the temperature in Fahrenheit?: ");
        double temperature = input.nextDouble();

        
        if (rainingInput.equals("yes")) {
            System.out.println("It's raining! Don't forget to bring an umbrella.");
        }

        if (temperature < 32) {
            System.out.println("It's very cold! Bring a heavy jacket.");
        } else if (temperature >= 32 && temperature <= 50) {
            System.out.println("It's chilly! Bring a light jacket.");
        } else {
            System.out.println("No jacket needed, enjoy the weather!");
        }

        
    }
}



