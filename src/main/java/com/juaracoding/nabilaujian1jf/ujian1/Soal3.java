package com.juaracoding.nabilaujian1jf.ujian1;

import java.util.Scanner; // Import package utils scanner

public class Soal3 {

    public static void main(String[] args) {

        // Variable to define value
        int priceWeekday = 35000;
        int priceWeekend = 45000;
        double discount = 0.10; // discount 10%

        // Package scanner for user's input
        Scanner scanner = new Scanner(System.in);

        // Declare statement to call scanner that used for user's input
        System.out.print("Masukkan jumlah tiket: ");
        int ticket = scanner.nextInt();
        System.out.print("Apakah hari ini termasuk Weekday? (true / false): ");
        boolean isWeekday = scanner.nextBoolean();

        // Define price ticket from boolean values
        int priceTicket;
        if (isWeekday) {
            priceTicket = priceWeekday;
        } else {
            priceTicket = priceWeekend;
        }

        // Count a total price from input ticket and defined price ticket
        int totalPrice = ticket * priceTicket;
        System.out.println("\nJumlah Tiket: " + ticket);

        // If totalTicket more than 5, get a 10% discount, then print the final ticket
        if (ticket > 5) {
            totalPrice -= totalPrice * discount;
            System.out.println("Total harga (dengan diskon): " + totalPrice);
        } else {
            System.out.println("Total harga (tanpa diskon): " + totalPrice);
        }

    }

}