package com.juaracoding.nabilaujian1jf.ujian1;

public class Soal1 {

    // Variable to store value
    String movieTitle = "Avengers: Endgame";
    int price = 50000;
    int ticket = 3;

    public static void main(String[] args) {

        // Call variables
        Soal1 bioskop = new Soal1();

        // Print the result of movie ticket
        System.out.println("Nama Film: " + bioskop.movieTitle);
        System.out.println("Harga Tiket: " + bioskop.price);
        System.out.println("Jumlah Tiket: " + bioskop.ticket);

    }

}