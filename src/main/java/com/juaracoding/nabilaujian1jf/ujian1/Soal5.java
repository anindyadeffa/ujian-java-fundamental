package com.juaracoding.nabilaujian1jf.ujian1;

import java.util.Scanner; // Import package utils scanner

public class Soal5 {

    public static void main(String[] args) {
        // Package scanner for user's input
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0; // Variable to store value
        int[] prices = new int[5]; // Determine the size or length of an array

        // Looping: used for user's input a ticket price
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Harga tiket film " + (i+1)+ ": ");
            prices[i] = scanner.nextInt();
        }

        // Calculate with a for-each to loop all values in an array and store value in totalPrice
        for (int price : prices) {
            totalPrice += price;
        }

        // Print the result of total price
        System.out.println("Total harga tiket: " + totalPrice);

    }

}
