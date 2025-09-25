package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What size sandwich would you like?\n" +
                "1: Regular - base price - $5.45\n" +
                "2: Large - base price - $8.95\n" +
                "Type in 1 or 2: ");
        int orderSize = input.nextInt();

        // double basePrice = (orderSize == 1) ? 5.45 : 9.95;
        double basePrice = 0;
        if (orderSize == 1){
            basePrice = 5.45;
        } else if (orderSize == 2){
            basePrice = 8.95;
        } else {
            System.out.println("Order size is not valid.");
        }

        System.out.println("How old are you?");
        int age = input.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount = 0.1;
        } else if (age >= 65) {
            discount = 0.2;
        }

        double discountedPrice = basePrice - (basePrice * discount);

        System.out.printf("The cost of your sandwich is: $%.2f", discountedPrice);

        input.close();
    }
}
