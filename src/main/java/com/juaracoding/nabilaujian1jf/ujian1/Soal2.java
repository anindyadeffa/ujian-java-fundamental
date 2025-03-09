package com.juaracoding.nabilaujian1jf.ujian1;

import java.util.Scanner; // Import package scanner

public class Soal2 {

    public static void main(String[] args) {
        // Package scanner for user's input
        Scanner scanner = new Scanner(System.in);

        // Declare statement to call scanner that used for user's input a movie title
        System.out.print("Masukkan nama film: ");
        String movieTitle = scanner.nextLine();

        // Method to convert the movie title to uppercase text
        String movieTitleUpperCase = movieTitle.toUpperCase();

        // Print the result of movie title in uppercase text
        System.out.println("Nama film dalam huruf besar: " + movieTitleUpperCase); // Print output

    }

}